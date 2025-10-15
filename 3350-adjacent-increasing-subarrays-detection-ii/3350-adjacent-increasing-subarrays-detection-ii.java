class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int cnt = 1 , prvcnt = 0, ans = 0;
        for(int i = 1 ; i < n ; i ++){
            if(nums.get(i) > nums.get(i - 1)){
                cnt += 1;
            }
            else{
                prvcnt = cnt;
                cnt = 1;
            }
            ans = Math.max(ans , Math.min(prvcnt , cnt));
            ans = Math.max(ans ,cnt/2);
        }
        return ans;
    }
}