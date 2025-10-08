class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int ans[] = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0 ; i < spells.length ; i ++){
            int ceil = findCeil(spells[i] , potions , success);
            ans[i] = (ceil != -1)? potions.length - ceil : 0;
        }
        return ans;
    }
    private int findCeil(int spell , int[] potions , long success){
        long ans ;
        int low = 0 , high = potions.length - 1 , mid , ceil = -1;
        while(low <= high){
            mid = (low + high) / 2;
            ans = (long)(potions[mid] * spell);
            if(ans >= success){
                ceil = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ceil;
    }
}