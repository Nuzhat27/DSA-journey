class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums){
            sum += num;
            if(num > max)max = num;
        }
        return (n * max) - sum;
    }
}