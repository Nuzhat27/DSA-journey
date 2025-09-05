class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*n-1 ; i >= 0 ; i --){
            while(!st.isEmpty() && st.peek() <= nums[i % nums.length])
            {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i % nums.length] = -1;
            }
            else ans[i % nums.length] = st.peek();
            st.push(nums[i % nums.length]);
        }
        return ans;
    }
}
