class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][n];

        //Initialize the last row
        for(int j1 = 0 ; j1 < n ; j1 ++){
            for(int j2 = 0 ; j2 < n ; j2 ++){
                dp[m - 1][j1][j2] = (j1 == j2)?grid[m - 1][j1] : grid[m - 1][j1] + grid[m - 1][j2];
            }
        }

        for(int i = m - 2 ; i >= 0 ; i --){
            for(int j1 = 0 ; j1 < n ; j1 ++){
                for(int j2 = 0; j2 < n ; j2 ++){
                    int maxi = Integer.MIN_VALUE;
                    for(int dj1 = -1 ; dj1 <= 1 ; dj1 ++){
                        for(int dj2 = -1; dj2 <= 1 ; dj2 ++){
                            int ans;
                            if(j1 == j2)ans = grid[i][j1];
                            else ans = grid[i][j1] + grid[i][j2];

                            if(j1 + dj1 < 0 || j1 + dj1 >= n || j2 + dj2 < 0 || j2 + dj2 >= n)ans += -1e9;
                            else ans += dp[i + 1][j1 + dj1][j2 + dj2];
                            maxi = Math.max(maxi ,ans);
                        }
                    }
                    dp[i][j1][j2] = maxi;
                }
            }
        }
        return dp[0][0][n - 1];
    }
}