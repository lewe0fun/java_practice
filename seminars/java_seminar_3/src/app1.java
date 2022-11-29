import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class app1 {
    //Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    public static <integer> void main(String[] args) {
        Random rnd =new Random();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(100));
            System.out.println(arr.get(i));
        }
        Collections.sort(arr);
for (int i:arr)
{
    System.out.println(i);
}
    }
}