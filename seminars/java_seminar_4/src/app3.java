//Реализовать консольное приложение, которое:
//
//1. Принимает от пользователя строку вида
//
//text~num
//
//1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите текст вида text~num");
        String line = sc.nextLine();
        LinkedList<String>ll=new LinkedList<>();
        String[] value=line.split("~");

        for (int i = 0; i < Integer.parseInt(value[1]); i++)
            ll.add(value[0]+" "+(i+1));
        if(Objects.equals(value[0],"print"))
            System.out.println(ll.removeLast());

        System.out.println(ll);
    }
}
