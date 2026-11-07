class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 0;
        int m  = dictionary.length;
        for(int i = n - 1 ; i >= 0 ; i --){
            dp[i] = 1 + dp[i + 1];
            for(String wd : dictionary){
                if(s.startsWith(wd, i)){
                    dp[i] = Math.min(dp[i] , dp[i + wd.length()] );
                }
            }
        }
        return dp[0];
    }
}