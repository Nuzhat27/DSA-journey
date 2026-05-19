class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i = n - 2 ; i >= 0 ; i --){
            if(nums[i] < nums[i + 1]){
                ind = i ;
                break;
            }

        }
        if(ind == -1){
            reverse(nums , 0 , n - 1);
            return;
        }
        for(int i = n - 1 ; i >= 0 ; i --){
            if(nums[i] > nums[ind]){
                swap(nums , ind , i);
                break;
            }
        }
        reverse(nums , ind + 1 , n - 1);
    }
    public static void swap(int[] nums , int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public static void reverse(int[] nums, int left , int right){
        while(left < right){
            swap(nums , left , right);
            left ++;
            right --;
        }
    }
}