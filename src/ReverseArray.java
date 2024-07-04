import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n/2; i++) {
            int t = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = t;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverse(nums);
    }
}
