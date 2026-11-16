class Solution {
    public long countConsistent(int[] nums) {
        int n = nums.length;
        int BITS = 20;

        int[][] left = new int[n+1][BITS];
        int[][] right = new int[n+2][BITS];

        for(int b = 0 ; b < BITS; b ++){
            right[n+1][b] = n + 1;
        }

        int maxi = 0;
        for(int num : nums)maxi = Math.max(maxi, num);
        int[] leftOcc = new int[n+1];
        int[] leftIdx = new int[maxi+1];

        for(int i = 1; i <= n ; i ++){
            int x = nums[i-1];
            leftOcc[i] = leftIdx[x];
            leftIdx[x] = i; 
            for(int b = 0 ; b < BITS; b ++){
                if((x & (1 << b)) == 0)left[i][b] = i;
                else left[i][b] = left[i-1][b];
            }
        }

        for(int i = n ; i >= 1 ; i --){
            int x = nums[i-1];
            
            for(int b = 0 ; b < BITS; b ++){
                if((x & (1 << b)) == 0)right[i][b] = i;
                else right[i][b] = right[i+1][b];
            }
        }

        long ans = 0;
        
        for(int i = 1 ; i <= n ; i ++){
            int L = leftOcc[i], R = n+1;
            for(int b = 0 ; b < BITS; b ++){
                if((nums[i-1] & (1 << b)) == 0)continue;
                L = Math.max(L, left[i][b]);
                R = Math.min(R, right[i][b]);
            }

            ans += (long)(i - L)*(R - i);
        }
        return ans;
    }
}