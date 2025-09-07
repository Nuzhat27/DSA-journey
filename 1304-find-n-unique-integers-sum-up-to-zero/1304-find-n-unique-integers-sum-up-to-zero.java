class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for(int i = 1 ; i <= n/2 ; i ++){
            ans[i - 1] = i ;
            ans[n - i] = -i;  
        }
        if(n % 2 != 0){
            ans[n/2] = 0;
        }
        return ans;
    }
}