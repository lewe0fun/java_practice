// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// [3,7,2,4,9,1,0]
public class app5 {
    public static void main(String[] args)
    {
        int [] nums =new int []{7,0,7,7,9,1,0};
        int val = 7;
        int count=0;
        for (int i=0;i<nums.length;i++)
            if (nums[i]==val)count++;
        for(int j=0;j<=count;j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        for(int i:nums)
        {
            System.out.print(i);
        }
    }
}
