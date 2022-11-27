import java.io.FileWriter;
import java.io.IOException;
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class app1 {
    public static void main(String[] args) {
        int arr[] ={9,8,7,6,0,4,3,1};
        try {
            FileWriter fw = new FileWriter("log.txt",false);
            System.out.println("Задан массив: ");
            for (int i:arr)
                System.out.print(i);
            System.out.println('\n');
            for (int i = 0; i <arr.length ; i++)
                for (int j = 0; j < arr.length; j++)
                    if(arr[i]<arr[j]) {
                        fw.write(arr[i]+" под номером "+(i+1)+" меняется на "+arr[j]+" под номером "+(j+1)+"-->");
                        int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
                        for (int k:arr)
                            fw.write(Integer.toString(k));
                        fw.write('\n');
                    }
            fw.flush(); fw.close();
            System.out.println("Отсортированный пузырьковой \nсортировкой, массив: ");
            for (int i:arr)
                System.out.print(i);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}