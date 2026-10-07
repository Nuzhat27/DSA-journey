class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int x = Integer.MAX_VALUE, res = 0;
        for(int i = 0 ; i < n ; i ++){
            if(i > 0 && nums[i] == nums[i - 1])continue;
            int j = i + 1, k = n - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k]; 
                int diff = Math.abs(target - sum);
                if(diff <= x){
                    x = diff;
                    res = sum;
                }
                if(sum > target)k --;
                if(sum < target)j ++;
                else{
                    while(j < k && nums[j] == nums[j + 1])j ++;
                    while(j < k && nums[k] == nums[k - 1])k--;
                    j ++; k--;
                }
            }
        }
        return res;
    }
}