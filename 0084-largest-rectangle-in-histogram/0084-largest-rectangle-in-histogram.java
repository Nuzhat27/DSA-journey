class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0, nse, pse, ind, area;
        for (int i = 0; i < n; i++) {
            int curEle = heights[i];
            while (!st.isEmpty() && heights[st.peek()] >= curEle) {
                ind = st.pop();
                pse = st.isEmpty() ? -1 : st.peek();
                nse = i;
                area = (nse - pse - 1) * heights[ind];
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ind = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            nse = n;
            area = (nse - pse - 1) * heights[ind];
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}