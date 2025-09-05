class Solution {
    private int[] findNSE(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1 ; i >= 0 ; i --){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty()? st.peek() : n;
            st.push(i);
        }
        return ans;
    }
    private int[] findPSEE(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i ++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            ans[i] = !st.isEmpty()? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0 ;
        int mod = (int)1e9 + 7;
        int left , right;
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        for(int i = 0 ; i < n ; i ++){
            int curEle = arr[i];
            left = i - psee[i];
            right = nse[i] - i;
            long freq = (long)left * right;
            int val = (int)((freq * curEle) % mod);
            sum = (sum + val) % mod;
        }
        return sum;
    }
}