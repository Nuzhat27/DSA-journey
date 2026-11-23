class Solution {
    public int numTilings(int n) {
        if(n == 1)return 1;
        if(n == 2)return 2;
        int MOD = 1_000_000_007;
        long[] f = new long[n+1];
        long[] g = new long[n+1];
        f[0] = 1; f[1] = 1;
        g[0] = 0; g[1] = 1;
        for(int i = 2; i <= n ; i ++){
            f[i] = (f[i-1] + f[i-2] + 2*g[i-2])% MOD;
            g[i] = (f[i-1] + g[i-1])% MOD;
        }
        return (int)f[n];
    }
}