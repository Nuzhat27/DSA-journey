class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ind = -1;
        int low = 0 , high = n - 1;
        while(low <= high){
            int mid = (low + high ) / 2;
            if(nums[mid] == target){
                return mid;
            }
            //if left part is sorted
            if(nums[low] <= nums[mid]){
                //search target in sorted part
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{//target is in the unsorted part
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] <= nums[high]){
                    if(nums[mid] <= target && target <= nums[high]){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
        }
        return ind;
    }
}