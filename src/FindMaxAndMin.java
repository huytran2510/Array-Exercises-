public class FindMaxAndMin {
    public static void findMaxAndMin(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i< nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("max :" +  max);
        System.out.println("min :" +  min);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        findMaxAndMin(nums);
    }
}
