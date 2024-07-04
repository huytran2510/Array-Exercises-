import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void remove(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] newArrays = new int[n];
        int k =0;
        for(int i = 0 ; i< n-1 ; i++) {
            if(nums[i] != nums[i+1]){
                newArrays[k++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(newArrays));
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5};
        remove(nums);
    }
}
