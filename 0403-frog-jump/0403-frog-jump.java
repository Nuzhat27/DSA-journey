class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (n == 1)
            return true;
        if (stones[1] != 1)
            return false;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++)
            mpp.put(stones[i], i);

        //dp[i][k] = can i reach step i using k jumps 
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (!dp[i][k])
                    continue;
                for (int j = k - 1; j <= k + 1; j++) {
                    if (j <= 0 || j >= n)
                        continue;
                    int nextPosition = stones[i] + j;
                    if (mpp.containsKey(nextPosition)) {
                        int idx = mpp.get(nextPosition);
                        dp[idx][j] = true;
                    }
                }
            }
        }
        for (int k = 0; k < n; k++) {
            if (dp[n - 1][k])
                return true;
        }

        return false;
    }
}