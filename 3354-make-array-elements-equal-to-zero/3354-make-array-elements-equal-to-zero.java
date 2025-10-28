class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        /*Brute Force
        int validSelection = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if(simulate(nums.clone() , i , -1)) validSelection ++; //Moving in left direction
                if(simulate(nums.clone() , i , 1)) validSelection ++;//Moving in right direction
            }
        }
        return validSelection;
        }
        private boolean simulate(int[] nums , int curr , int direction){
        while(curr >= 0 && curr < nums.length){
            if(nums[curr] == 0){
                curr += direction;//Move in the same direction
            }
            else{
                nums[curr] --;
                direction *= -1;
                curr += direction;
            }
        }
        //Checking if all elements are zero or not
        for(int num : nums){
            if(num != 0) return false;
        }
        return true; */
        int ans = 0, sum = 0;
        for (int x : nums) {
            sum += x;
        }
        int leftSum = 0, rightSum = sum;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (leftSum - rightSum >= 0 && leftSum - rightSum <= 1) {
                    ans++;
                }
                if (rightSum - leftSum >= 0 && rightSum - leftSum <= 1) {
                    ans++;
                }
            } else {
                leftSum += nums[i];
                rightSum -= nums[i];
            }
        }
        return ans;
    }
}