import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountTheOccurrences {
    public static int countTheOccurrences1(int nums[]) {
        Map<Integer,Integer> numMap = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i< n ; i++ ) {
            if(numMap.containsKey(nums[i])){
                numMap.put(nums[i], numMap.get(nums[i])+1);
            } else {
                numMap.put(nums[i],1);
            }
        }

        int max = Integer.MIN_VALUE;
        int num = 0;

        for(Map.Entry<Integer,Integer> entry : numMap.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                num = entry.getKey();
            }
        }

        return num;
    }

    public static int countTheOccurrences2(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int maxCount = 1; int currentCount =1 ; int num = 0;
        for(int i = 1 ; i < n; i++) {
            if(nums[i] == nums[i-1]) {
                currentCount ++;
            } else {
                currentCount =1;
            }

            if(maxCount < currentCount) {
                maxCount = currentCount;
                num = nums[i];
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 2};
        System.out.println(countTheOccurrences2(nums));
    }
}
