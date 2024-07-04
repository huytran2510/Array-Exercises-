import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutive(int[] nums) {
        int n = nums.length;
        int num = 0;
        Arrays.sort(nums);
        for(int i = 1 ; i < n ;i++) {
            if(nums[i] == nums[i-1]+1) {
                num = nums[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongestConsecutive(nums));
    }
}
