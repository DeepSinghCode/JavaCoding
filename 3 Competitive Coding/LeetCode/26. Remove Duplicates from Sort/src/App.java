import java.io.*;

public class App {

    public static void main(String[] args) throws Exception {

        int array[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int arraySize = removeDuplicates(array);

        System.out.println(arraySize);

    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
