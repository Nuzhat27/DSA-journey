class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, maxWeight = Integer.MIN_VALUE;
        for(int w : weights){
            sum += w;
            maxWeight = Math.max(maxWeight, w);
        }
        int low = maxWeight, high = sum , mid, ans;
        while(low <= high){
            mid = (low + high) /2 ;
            if(canShip(weights, days, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean canShip(int[] w , int d, int c){
        int currentLoad = 0, daysNeeded = 1;
        for(int i = 0; i < w.length; i ++){
            if(w[i] + currentLoad > c){
                daysNeeded ++;
                currentLoad = 0;
            }
            currentLoad += w[i];
        }
        return daysNeeded <= d;
    }
}