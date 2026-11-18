class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if(n == 1)return true;
        if(stones[1] != 1)return false;

        HashSet<Integer> set = new HashSet<>();
        for(int stone : stones)set.add(stone);

        HashMap<Integer, HashSet<Integer>> dp = new HashMap<>();
        for(int stone : stones){
            dp.put(stone, new HashSet<>());
        }
        dp.get(0).add(0);

        for(int stone: stones){
            for(int jump : dp.get(stone)){
                for(int k = jump - 1; k <= jump + 1; k ++){
                    if(k <= 0)continue;

                    int next = stone + k;
                    if(set.contains(next)){
                        dp.get(next).add(k);
                    }
                }
            }
        }
        return !dp.get(stones[n-1]).isEmpty();
    }
}