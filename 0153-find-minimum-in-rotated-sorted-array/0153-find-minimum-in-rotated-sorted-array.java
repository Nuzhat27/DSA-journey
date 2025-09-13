class Solution {
    public int findMin(int[] nums) {
    if(nums.length == 1)return nums[0];
    int low = 0, high = nums.length - 1, mid, min = Integer.MAX_VALUE;
    while (low <= high) {
      mid = (low + high) / 2;
      if(nums[low] <= nums[mid]){
        min = Math.min(nums[low] , min);
        low = mid + 1;
      }
      else{
        min = Math.min(nums[mid] , min);
        high = mid - 1;
      }
    }
    return min;
  }
}

