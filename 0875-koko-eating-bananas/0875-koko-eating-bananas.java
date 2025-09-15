class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i ++){
            max = Math.max(max , piles[i]);
        }
        int low = 0 , high = max , mid;
        while(low <= high){
            mid = (low + high)/2;
            if(totalHours(piles, mid) <= h){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return low;
    }
    private int totalHours(int[] piles , int k){
        int n = piles.length;
        int totalHours = 0;
        for(int i = 0 ; i < n ; i ++){
            totalHours += Math.ceil((double)piles[i] / (double)k);
        }
        return totalHours;
    }
}