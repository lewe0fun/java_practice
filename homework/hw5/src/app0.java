import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class app0 {
    public static void main (String[] args) {
        Map<String, int[]> phoneBook=new HashMap<>();
        phoneBook.put("Иванов", new int[]{329845});
        phoneBook.put("Петров",new int[]{456457, 364512});
        phoneBook.put("Сидоров",new int[]{456258, 364575,257963});
        for (var i:phoneBook.entrySet())
            System.out.println("Фамилия: "+i.getKey()+ sep(i.getValue()));
    }
    public static StringBuilder sep(int[] value)
    {
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            result.append(", телефон №").append(i + 1).append(": ").append(value[i]);
        }
        return result.append(".");
    }
}