class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int best =  Integer.MAX_VALUE;
        int n = nums.size();
        int[] prefix = new int[n+1];
        for(int i = 0 ; i < n ; i ++){
            prefix[i+1] = prefix[i] + nums.get(i);
        }

        for(int i = 0 ; i < n ; i ++){
            for(int len = l ; len <= r && i + len <= n ; len ++){
                int sum = prefix[len + i] - prefix[i];
                if(sum > 0)best = Math.min(sum, best);
            }
        }
        return (best == Integer.MAX_VALUE)? -1 : best;
    }
}