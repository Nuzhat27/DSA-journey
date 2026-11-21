class Solution {
    public long maximumSum(List<Integer> nums) {
        int n = nums.size();

        long[] sum = new long[n+1];

        long ans = 0;
        for(int i = 1 ; i <= n ; i ++){
            int s = i;
            for(int f = 2; f * f <= s; f ++){
                while(s % (f*f) == 0)s = s / (f*f);
            }
            sum[s] += nums.get(i-1);
            ans = Math.max(ans, sum[s]);
        }

        return ans;

    }
}