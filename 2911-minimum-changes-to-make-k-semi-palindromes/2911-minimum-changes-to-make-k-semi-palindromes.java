class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        for(int i = 0 ; i < n ; i ++){
            for(int j = i+1; j < n ; j ++){
                int len = j-i+1;
                cost[i][j] = Integer.MAX_VALUE;
                //Trying every valid divisor of len
                for(int d = 1; d < len ; d++){
                    if(len % d != 0)continue;
                    int changes = 0;
                    //Calculating changes for each group 
                    for(int g = 0 ; g < d; g ++){
                        int lt = i + g;
                        int rt = lt + ((len / d) - 1)*d;
                        while(lt < rt){
                            if(s.charAt(lt) != s.charAt(rt)){
                                changes ++;
                            }
                            lt += d ;
                            rt -= d;
                            }
                    }
                    cost[i][j] = Math.min(cost[i][j], changes); 
                }
            }
        }

        int INF = 1_000_000_007;
        int[][] dp = new int[n+1][k+1];
        for(int[] row : dp)Arrays.fill(row, INF);
        dp[0][0] = 0;
        //i = no. of characters considered
        for(int i = 2; i <= n ; i ++){
            //j = no. of substrings
            for(int j = 1; j <= k ; j ++){
                //p = starting index of last substring
                for(int p = 2*(j-1); p <= i-2; p ++){
                    if(dp[p][j-1] == INF)continue;
                    dp[i][j] = Math.min(dp[i][j], dp[p][j-1] + cost[p][i-1]);
                }
            }
        }
        return dp[n][k];
    }
}