class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i < n ; i ++){
            //Remove the indices which are not in the sliding window from front...
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

             /* Maintain the monotonic (decreasing) 
            order of elements in deque */
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }

            //we are storing the indices
            dq.offerLast(i);

            /*we calculate the max of a window after i has crossed 
            the last element of the window ..i + 1 elements should be >= k */
            if(i >= k - 1){
                result[index ++] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}