
import java.util.Arrays;

class MoveZerosLast {

    static int[] moveZerosLast(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int index = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }

        }
        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosLast(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 0, 0]
    }
}
