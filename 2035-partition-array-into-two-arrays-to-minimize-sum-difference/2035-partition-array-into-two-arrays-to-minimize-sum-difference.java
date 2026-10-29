class Solution {
    public int minimumDifference(int[] nums) {
        int total = 0;
        for(int n : nums)total += n;
        int n = nums.length / 2;
        HashMap<Integer, ArrayList<Integer>> L = new HashMap<>(), R = new HashMap<>();
        for(int k = 0 ; k <= n ; k ++){
            L.put(k, new ArrayList<>());
            R.put(k, new ArrayList<>());
        }
        
        for(int m = 0 ; m < (1 << n) ; m ++){
            int cnt = 0, s1 = 0, s2 = 0;
            for(int i = 0 ; i < n ; i ++){
                if((m >> i & 1) == 1){
                    cnt ++;
                    s1 += nums[i];
                    s2 += nums[n + i];
                } 
            }
            L.get(cnt).add(s1);
            R.get(cnt).add(s2);
        }
        for(List<Integer> r : R.values())Collections.sort(r);
        int ans = Integer.MAX_VALUE;
        for(int k = 0 ; k <= n ; k ++){
            List<Integer> r = R.get(n - k);
            for(int x : L.get(k)){
                int lo = 0, hi = r.size();
                while(lo < hi){
                    int mid = (lo + hi)/2;
                    if(2 * (x + r.get(mid)) >= total)hi = mid;
                    else lo = mid + 1;
                }
                if(lo < r.size())ans = Math.min(ans, Math.abs(total - 2 *(x + r.get(lo))));
                if(lo > 0)ans = Math.min(ans, Math.abs(total - 2 * (x + r.get(lo - 1))));
            }
        }
        return ans;
    }
}