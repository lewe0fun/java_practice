import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя и “запоминает” строки.
//2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//
public class app2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String line;
        Deque<String> dq=new ArrayDeque<>();
        do {
            System.out.println("Введите текст");
            line = sc.nextLine();
            if (Objects.equals(line,"print"))
            {
                String lastSave=dq.removeLast();
                String firstSave=dq.removeFirst();
                dq.addFirst(lastSave);
                dq.addLast(firstSave);
                break;
            }

            if(Objects.equals(line,"revert"))
            {
                String lastSave=dq.removeLast();
                dq.removeLast();
                dq.addLast(lastSave);
                break;
            }
            dq.addLast(line);
        } while(!(Objects.equals(line, "")));
        System.out.println(dq);

    }
}
