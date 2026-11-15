class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal <= 0)return true;
        int totalSum = (maxChoosableInteger + 1)*maxChoosableInteger / 2;
        if(totalSum < desiredTotal)return false;

        int n = maxChoosableInteger;

        int used = (1 << n);
        boolean[] dp = new boolean[used];

        for(int mask = used - 1; mask >= 0; mask --){
            int sum = 0;
            for(int i = 1; i <= n ; i ++){
                if((mask & (1 << (i-1))) != 0)sum += i;
            }
            int rem = desiredTotal - sum;
            for(int i = 1; i <= n ; i ++){
                int bit = 1 << (i-1);
                if((mask & bit) != 0)continue;
                if(i >= rem || !dp[mask|bit]){
                    dp[mask] = true;
                    break;
                }
            }
        }
        return dp[0];

    }
}