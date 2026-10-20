class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 1 ; i < m ; i ++)grid[i][0] += grid[i - 1][0];
        for(int j = 1 ; j < n ; j ++)grid[0][j] += grid[0][j - 1];
        for(int i = 1; i < m ; i ++){
            for(int j = 1; j < n ; j ++){
                grid[i][j] += Math.min(grid[i - 1][j] , grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
        /*
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(i == 0 && j == 0)continue;
                int left = (j > 0)? dp[i][j - 1] : Integer.MAX_VALUE;
                int up = (i > 0) ? dp[i - 1][j] : Integer.MAX_VALUE;
                dp[i][j] = grid[i][j] + Math.min(left, up);
            }
        }
        return dp[m - 1][n - 1];
        */
    }
}