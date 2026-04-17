class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int mirrorPair = Integer.MAX_VALUE;
        HashMap<Integer , Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            int x = nums[i];
            if(mpp.containsKey(x)){
                mirrorPair = Math.min(mirrorPair, i - mpp.get(x));
            }
            mpp.put(reverseNum(nums[i]) , i);
        }
        return (mirrorPair == Integer.MAX_VALUE) ? -1 : mirrorPair;
    }
    public static int reverseNum(int num){
        int rev = 0;
        while(num > 0){
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }
        return rev;
    }
}