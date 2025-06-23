import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int n = nums1.length;
        int m = nums2.length;
        int l = m + n;
        
        for (int i = 0; i < l; i++) {
            if (i < n) {
                arr[i] = nums1[i];
            } else {
                arr[i] = nums2[i - n];
            }
        }
        
        Arrays.sort(arr);
        
        if (l % 2 == 0) {
            int mid = l / 2;
            return ((double)(arr[mid - 1] + arr[mid])) / 2;
        } else {
            return arr[l / 2];
        }
    }
}