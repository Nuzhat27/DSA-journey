class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lt = 0, rt = n -1;
        int maxArea = 0, ht = 0;
        while(lt < rt){
            ht = Math.min(height[lt], height[rt]);
            maxArea = Math.max(maxArea, ht * (rt - lt));
            if(height[lt] <= height[rt])lt++;
            else rt --;
        }
        return maxArea;
    }
}