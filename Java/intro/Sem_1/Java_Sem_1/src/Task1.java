import java.sql.Array;
import java.util.Arrays;

public class Task1 {
    // Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 1, 3, 3, 5, 3, 2, 3};
        int val = 2;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] == val) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}