class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int nse, pse;
        int largestArea = 0;
        for(int i = 0 ; i < n ; i ++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int ind = st.pop();
                pse = st.isEmpty() ? -1 : st.peek();
                nse = i;
                int area = (nse - pse - 1)*heights[ind];
                largestArea = Math.max(area, largestArea);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse = n;
            int ind = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            int area = (nse - pse - 1) * heights[ind];
            largestArea = Math.max(area, largestArea);
        }
        return largestArea;
    }
}