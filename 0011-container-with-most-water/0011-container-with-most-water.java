class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length - 1 , maxArea = 0 ;
        while(left < right){
            if(height[left] < height[right]){
                maxArea = Math.max(maxArea , height[left] * (right - left));
                left += 1;
            }
            else{
                maxArea = Math.max(maxArea , height[right] * (right - left));
                right -= 1;
            }
        }
        return maxArea;
    }
}