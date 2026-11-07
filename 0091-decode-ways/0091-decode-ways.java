class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        //dp[i] = number of ways to decode the string from i to end
        //successful decoding -> reached the end of string -> return 1
        dp[n]= 1;
        for(int i = n - 1; i >= 0 ; i --){
            if(s.charAt(i) == '0')dp[i] = 0;
            else{
                dp[i] = dp[i + 1];//take one digit
                if(i + 1 < n){
                    int two = ((s.charAt(i) - '0' )* 10) + (s.charAt(i + 1) - '0');
                    if(two <= 26)dp[i] += dp[i + 2];//take two digits
                }
            }
        }
        return dp[0];
    }
}