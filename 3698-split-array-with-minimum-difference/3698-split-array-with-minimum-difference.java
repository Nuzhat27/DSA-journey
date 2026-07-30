class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;

        boolean[] incLeft = new boolean[n];
        incLeft[0] = true;
        for(int i = 1 ; i < n ; i ++){
            if(incLeft[i - 1] && nums[i] > nums[i - 1]) incLeft[i] = true;
        }

        boolean[] decRight = new boolean[n];
        decRight[n - 1] = true;
        for(int i = n - 2 ; i >= 0 ; i --){
            if(decRight[i + 1] && (nums[i] > nums[i + 1]))decRight[i] = true;
        }

        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for(int i = 1 ; i < n ; i ++){
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }

        long ans = Long.MAX_VALUE;
        for(int i = 0 ; i <= n - 2 ; i ++){
            if(incLeft[i] == true && decRight[i + 1] == true){
                long leftSum = prefixSum[i];
                long rightSum = prefixSum[n - 1] - prefixSum[i];
                ans = Math.min(ans, Math.abs(leftSum - rightSum));
            }
        }
        return (ans == Long.MAX_VALUE) ? -1 : ans;
    }
}