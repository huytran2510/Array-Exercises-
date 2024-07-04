public class InsertToArray {
    public static void insert(int nums[], int target, int index){
        int n = nums.length;
        int[] newArrays = new int[n+1];
        for(int i = 0 ; i< index ; i++) {
            newArrays[i] = nums[i];
        }

        newArrays[index] = target;

        for(int i = index; i < n; i++) {
            newArrays[i + 1] = nums[i];
        }

        for(int i = 0 ; i < newArrays.length; i++) {
            System.out.println(newArrays[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        insert(nums,3,2);
    }
}
