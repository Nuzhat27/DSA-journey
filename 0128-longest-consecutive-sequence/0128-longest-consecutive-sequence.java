class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int count = 0 , length = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                count = 1; int j = 1;
                while(set.contains(num + j)){
                    count ++;
                    j ++;
                }
                length = Math.max(count , length);   
            }
        }
        return length;
    }
}

