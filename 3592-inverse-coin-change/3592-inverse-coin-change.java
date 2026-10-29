class Solution {
    public List<Integer> findCoins(int[] numWays) {
        int n = numWays.length;
        List<Integer> coins = new ArrayList<>();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n ; i ++){
            int missing = numWays[i - 1] - dp[i];
            if(missing == 0)continue;
            if(missing != 1)return new ArrayList<>();
            coins.add(i);
            for(int s = i ; s <= n ; s ++){
                dp[s] += dp[s - i];
            }
        }
        return coins;
    }
}