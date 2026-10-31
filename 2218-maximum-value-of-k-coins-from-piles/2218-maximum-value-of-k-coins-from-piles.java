class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int m = piles.size();
        int NEG = - 1_00_000_000;

        int[][] dp = new int[m+ 1][k + 1];
        
        for(int j = 1; j <= k ; j ++)dp[0][j] = NEG;

        for(int i = 1; i <= m ; i ++){
            List<Integer> pile = piles.get(i -1);
            int size = pile.size();
            int[] prefixSum = new int[size + 1];
            for(int j = 1; j <= size ; j ++){
                prefixSum[j] = pile.get(j - 1) + prefixSum[j - 1];
            }

            for(int j = 0 ; j <= k ; j ++){
                int best = NEG;
                for(int t = 0; t <= Math.min(j, size) ; t ++){
                    best = Math.max(best, dp[i - 1][j - t] + prefixSum[t]);
                }
                dp[i][j] = best;
            }
        }
        return dp[m][k];
    }
}