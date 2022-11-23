// **Текст задачи:**
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида

// "Доброе утро, <Имя>!", если время от 05:00 до 11:59

// "Добрый день, <Имя>!", если время от 12:00 до 17:59;

// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;

// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        LocalTime nowTime = LocalTime.now();
        int hours = nowTime.getHour();
        System.out.print("Доборое");
        if (hours>=5 && hours<12)System.out.print( " утро " );
        else if (hours>=12 && hours<18)System.out.print( " день " );
        else if (hours>=18 && hours<23)System.out.print( " вечер " );
        else System.out.print( " ночи " );
        System.out.println(name);
    }
}
