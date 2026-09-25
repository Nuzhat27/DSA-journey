class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int num : piles){
            max = Math.max(num, max);
        }
        int low = 1, high = max, mid, ans;
        while(low <= high){
            mid = (low + high)/2;
            if(calHours(mid, piles) <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    private int calHours(int k , int[] piles){
        int totalHours = 0;
        for(int num : piles){
            totalHours += Math.ceil((double)num / (double)k);
        }
        return totalHours;
    }
}