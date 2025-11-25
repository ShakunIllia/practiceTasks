import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{5, 1, 32, 100, 31, 13})));
        System.out.println(Arrays.toString(reverseArray(new int[]{7, 325, 4, 94, 15})));
    }

    public static int[] reverseArray(int[] nums) {

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }
        return result;

    }

}