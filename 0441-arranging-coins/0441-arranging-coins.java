class Solution {
    public int arrangeCoins(int n) {
        long coinsNeeded = 0;
        if(n == 1)return 1;
        long lo = 0, hi = n, mid;
        while(lo <= hi){
            mid = (lo + hi)/2;
            coinsNeeded = mid * (mid + 1) / 2;
            if(coinsNeeded > n){
                hi = mid - 1;
            }
            if(coinsNeeded < n){
                lo = mid + 1;
            }
            if(coinsNeeded == n)return (int)mid;
            
        }
        return (int)hi;
    }
}