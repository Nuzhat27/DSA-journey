class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n1 = nums1.length , n2 = nums2.length;
        int dis = 0;
        int i = 0 , j ;
        for(i = 0 ; i < n1 ; i ++){
            int low = i , high = n2 - 1;
            int index = 0;
            while(low <=  high){
                int mid = (low + high) / 2;
                if(nums1[i] <= nums2[mid]){
                    index = mid;
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            dis = Math.max(dis , index - i);

        }
        return dis;
    }
}