class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0 , right = n - 1 , maxArea = 0 , area ;
        while(left < right){
            if(height[left] < height[right]){
                area = height[left] * (right - left);
                maxArea = Math.max(maxArea , area);
                left += 1;
            }
            else{
                area = height[right] * (right - left);
                maxArea = Math.max(maxArea , area);
                right -= 1;
            }
        }
        return maxArea;
    }
}