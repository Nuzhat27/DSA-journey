class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int half = (m + n + 1) / 2;
        int low = 0, high = m;


        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = half - cut1;

            int maxLeft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int minRight1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];

            int maxLeft2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int minRight2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 1) {
                   return  (double) Math.max(maxLeft1, maxLeft2);
                } else {
                   return  (double) (Math.max(maxLeft1, maxLeft2) + 
                   Math.min(minRight1 , minRight2)) / 2.0;
                }
            }

            else {
                if (maxLeft1 > minRight2) { // cut1 is too right
                    high = cut1 - 1;
                }
                else{
                    low = cut1 + 1;
                }
            }
        }
        return -1;
    }
}