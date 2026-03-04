class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        /*for(int i = 0 ;i < n ; i ++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums; */
        int left = 0 , right = n - 1 , pos = n - 1 ;
        int[] res = new int[n];
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[pos] = nums[left] * nums[left];
                left ++;
            }
            else{
                res[pos] = nums[right] * nums[right];
                right --;
            }
            pos --;
        }
        return res;
    }
}