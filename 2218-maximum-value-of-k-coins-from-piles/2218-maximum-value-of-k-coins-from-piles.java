class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        int NEG = -1_00_000_000;
        
        int[][] dp = new int[n + 1][k + 1];

        for(int i = 1 ; i <= k ; i ++)dp[0][i] = NEG;//cant take any coin from zero piles

        for(int i = 1 ; i <= n ; i ++){
            List<Integer> pile = piles.get(i - 1);
            int size = pile.size();
            int[] prefixSum = new int[size + 1];
            for(int j = 1 ; j <= size ; j ++){
                prefixSum[j] = prefixSum[j - 1] + pile.get(j - 1);
            }

            for(int j = 0 ; j <= k ; j ++){
                int best = Integer.MIN_VALUE;
                for(int t = 0 ; t <= Math.min(size, j) ; t ++){
                    best = Math.max(best, dp[i - 1][j - t] + prefixSum[t]);
                }
                dp[i][j] = best;
            }
        }
        return dp[n][k];
    }
}