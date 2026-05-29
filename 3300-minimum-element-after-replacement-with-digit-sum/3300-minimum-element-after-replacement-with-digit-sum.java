class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            int digitSum = findDigitSum(num);
            min = Math.min(min , digitSum);
        }
        return min;
    }
    public static int findDigitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}