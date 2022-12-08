import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

////Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
////123456 Иванов
////321456 Васильев
////234561 Петрова
////234432 Иванов
////654321 Петрова
////345678 Иванов
////Вывести данные по сотрудникам с фамилией Иванов.
//
public class app1 {
    public static void main(String[] args) {
        Map<Integer,String> list=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер Фамилию");
            String value=sc.nextLine();
            String[]str=value.split(" ");
            list.put(Integer.parseInt(str[0]),str[1]);
        }
        System.out.println();

for(var el:list.entrySet()){
    if(el.getValue().equals("Иванов"))
    System.out.println(el.getKey()+" "+el.getValue()+'\n');
}

    }
}