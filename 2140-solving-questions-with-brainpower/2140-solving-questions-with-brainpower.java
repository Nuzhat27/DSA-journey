class Solution {
    public long mostPoints(int[][] questions) {
        int m = questions.length;
        int n = questions[0].length;

        long[] dp = new long[m+1];
        //dp[i] = points earned by solving questions from i to last 
        dp[m] = 0;

        for(int i = m-1 ; i >= 0; i--){
            long skip = dp[i+1];
            int next = Math.min(m, i + questions[i][1] + 1) ;
            long solve = questions[i][0] + dp[next];
            dp[i] = Math.max(skip, solve);
        }
        return dp[0];
    }
}