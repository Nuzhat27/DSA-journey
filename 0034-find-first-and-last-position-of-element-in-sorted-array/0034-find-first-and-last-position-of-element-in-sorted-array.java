class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int firstOccurence = firstSearch(nums , target);
        int lastOccurence = lastSearch(nums , target);
        return new int[]{firstOccurence , lastOccurence};
    }
    public static int firstSearch(int[] nums , int target){
        int n = nums.length;
        int low = 0 , high = n - 1 , ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int lastSearch(int[] nums , int target){
        int n = nums.length;
        int low = 0 , high = n - 1 , ans = -1; 
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}