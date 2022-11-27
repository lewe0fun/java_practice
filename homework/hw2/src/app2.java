import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
//К калькулятору из предыдущего дз добавить логирование.
public class app2 {
    public static void main(String[] args) throws IOException {
        String txt1="Введите первое число:";
        Scanner data = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = data.nextInt();
        System.out.println("Введите операцию: /,*,-,+");
        char op = data.next().charAt(0);
        double b;
        double c = 0;
        do{
            System.out.println("Введите второе число:");
            b = data.nextInt();
            if (op=='/'&& b==0)System.out.println("Нельзя делить на ноль");
        }while(op=='/'&& b==0);

        System.out.print("Результат: ");
        switch (op) {
            case '/' -> c=a / b;
            case '*' -> c=a * b;
            case '-' -> c=a - b;
            case '+' -> c=a + b;
        }

        String ans=""+a+op+b+"="+c;
        System.out.println(ans);
        logi(ans);
    }
    public static void logi(String str) throws IOException {
        Logger logger = Logger.getLogger(app3.class.getName());
        FileHandler fh = new FileHandler("calcLog.txt",true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(str);
    }
}
