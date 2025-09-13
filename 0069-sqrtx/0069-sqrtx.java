class Solution {
    public int mySqrt(int x) {
        long low = 0 , high = x , mid , ans = 0;
        while(low <= high){
            mid = (low + high)/2;
            long val = mid * mid;
            if(val <= x){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return (int)ans;
    }
}