public class SumOfArray {
    public static int sumOfArrays(int[] arrays) {
        int sum = 0;
        for(int i = 0 ; i < arrays.length ; i++) {
            sum += arrays[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sumOfArrays(nums));
    }

}
