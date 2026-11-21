class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;

        Deque<Integer> dq = new ArrayDeque<>();
        int[] dp = new int[n];
        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i ++){
            //removing expired indices
            while(!dq.isEmpty() && dq.peekFirst() < i - k){
                dq.pollFirst();
            }

            //calculate dp[i]
            int bestPrev = (dq.isEmpty())?0:Math.max(0, dp[dq.peekFirst()]);
            dp[i] = nums[i] + bestPrev;
            
            ans = Math.max(ans, dp[i]);

            //remove weaker values
            while(!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return ans;
    }
}