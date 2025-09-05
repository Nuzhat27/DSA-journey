class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        for(int i = 0 ; i < n1 ; i ++){
            int j = 0 ;
            while(nums2[j] != nums1[i]){
                j ++;
            }
            ans[i] = -1;
            for(int k = j+1 ; k < n2 ; k ++){
                if(nums2[k] > nums1[i]){
                    ans[i] = nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}