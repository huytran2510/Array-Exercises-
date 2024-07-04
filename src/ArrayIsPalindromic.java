public class ArrayIsPalindromic {
    public static boolean check(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n/2 ; i++ ){
            if(nums[i] != nums[n-i-1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2,1};
        System.out.println(check(nums));
    }
}
