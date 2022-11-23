// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
import java.util.Random;
public class app4 {
    public static void main(String[] args)
    {
        int counter=0;
        int result=0;
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= new Random().nextInt(0,2);
            if (arr[i]==1) counter++;
            else counter=0;
            if (counter>result)result=counter;
            System.out.print(arr[i]);
        }

        System.out.printf("\n максимальное количество подряд идущих 1: %d",result);

    }
}
