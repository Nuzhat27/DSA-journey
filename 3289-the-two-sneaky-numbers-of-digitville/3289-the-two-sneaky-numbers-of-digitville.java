class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        int xorNum = 0 , xorRange = 0;
        for(int num : nums){
            xorNum ^= num;
        }
        for(int i = 0 ; i < n ; i ++){
            xorRange ^= i;
        }
        int xorAll = xorNum ^ xorRange;
        int lowBit = xorAll & -xorAll;
        int x1 = 0 , x2 = 0;
        for(int x : nums){
            if((x & lowBit) != 0) x1 ^= x;
            if((x & lowBit) == 0) x2 ^= x;
        }
        for(int i = 0 ; i < n ; i ++){
            if((i & lowBit) != 0) x1 ^= i;
            if((i & lowBit) == 0) x2 ^= i;
        }
        return new int[]{x1 , x2};
    }
}