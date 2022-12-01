import java.util.Arrays;
import java.util.Random;
//Реализовать алгоритм сортировки слиянием (НЕОБЯЗАТЕЛЬНОЕ)
public class app1 {
    public static void main(String[] args) {

        Random rnd =new Random();
        int[]arr=new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i]=rnd.nextInt(1,10);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[]arr)
    {
        int full=arr.length;
        if (full==1) return; //точка выхода из рекурсии
        int mid=full/2;//центр целевого массива
        int[]left=new int[mid];//левый массив
        int[]right=new int[full-mid];//правый массив
        for (int i = 0; i < mid; i++) left[i]=arr[i];//заполняем левый массив
        for (int i = mid; i < full; i++) right[i-mid]=arr[i];//заполняем правый массив
        mergeSort(left);// рекурсивное длеление массива left
        mergeSort(right);// рекурсивное длеление массива right
        //слияние массивов
        int counter=0, i=0,j=0;//счетчики главный/левый/правый
        while(i<left.length && j<right.length)
            if (left[i]<right[j])
                arr[counter++]=left[i++];
            else
                arr[counter++]=right[j++];
        //Дозапись элемента
        for (int ii = i; ii < left.length; ii++)
            arr[counter++]=left[ii];
        for (int jj = j; jj < right.length; jj++)
            arr[counter++]= right[jj];
    }
}