import java.util.Arrays;

public class MergeTwoSorted {
    public static void merge(int[] nums1 , int n , int[] nums2, int m) {
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while (i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while( j>=0) {
            nums1[k--] = nums2[j--];
        }

        while( i>=0) {
            nums1[k--] = nums1[i--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,4,0,0,0};
        int[] nums2 = {2,6,5};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
