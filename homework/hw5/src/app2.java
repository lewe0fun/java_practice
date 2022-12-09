import java.util.Arrays;
//Реализовать алгоритм пирамидальной сортировки.
//        Arr[0]        Root
//        Arr[(i-1)/2]	Returns the parent node
//        Arr[(2*i)+1]	Returns the left child node
//        Arr[(2*i)+2]	Returns the right child node
public class app2 {

    public static void main(String[] args) {
        int[] arr={99,54,68,49,78,35,14,65,-68,7,0,6,8,32};
        heapSort(arr);
    }
    public static void heapSort(int[] arr) {
        int size = arr.length-1;
        for (int i = arr.length / 2; i >= 0; i--)
            heapify(arr, i, size);//строим все дерево
        for(int i= size; i>=0; i--) {//основная сортировка(ставя максимальный элемент в конец массива)
           int temp = arr[0];
            arr[0] = arr[size];
            arr[size--] = temp;
            heapify(arr, 0, size);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void heapify (int [] arr, int i, int size) {//массив в дерево
        int left = 2*i+1;//левый лист
        int right = 2*i+2;//правый лист
        int largest =i;//больший лист
        if (left<= size && arr[left] > arr[largest]) //левый и в массиве и больше большего
            largest = left;
        if (right <= size && arr[right] > arr[largest]) //правый и в массиве и больше большего
            largest = right;
        if (largest != i) {//один из листьев оказался больше
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, size);//спуск дальше по дереву
        }
    }
}