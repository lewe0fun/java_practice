import java.time.LocalDateTime;
import java.util.Scanner;
public class app2 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
//        LocalDateTime nowTime = LocalDateTime.now();

        System.out.println("Привет "+name);
        System.out.printf("Привет %s",name);
    }
}
