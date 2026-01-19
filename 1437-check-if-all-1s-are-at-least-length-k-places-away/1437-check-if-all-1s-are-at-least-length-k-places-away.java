class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int lastSeen = -1;
        boolean away = true;
        for(int i = 0 ;i < n ; i ++){
            if(nums[i] == 1){
                if(lastSeen != -1 && (i - lastSeen - 1) < k){
                    return false;
                }
                lastSeen = i;
            }
        }
        return away;
    }
}