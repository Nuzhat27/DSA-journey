class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[50][50];
        return solve(values , 0 , n - 1 , dp);
    }
    private int solve(int[] values , int i , int j , int[][] dp){
        if(i + 1 == j)return 0;
        if(dp[i][j] != 0)return dp[i][j];
        else{
            int score = Integer.MAX_VALUE;
            for(int k = i + 1 ; k < j ; k ++){
                score = Math.min(score , values[i] * values[k] * values[j] + solve(values , i , k , dp) + solve(values , k , j , dp));
            }
            dp[i][j] = score;
        }
        return dp[i][j];
    }
}