class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long n1 = need1, n2 = need2, c1 = cost1, c2 = cost2, cb = costBoth;
        
        //Buy no type 3 items
        long costPrice1 = n1 * c1 + n2 * c2;

        //Buy min(needs) using type3 and cover rest individually
        long common = Math.min(n1, n2);
        long costPrice2 = common * cb + (n1 - common) * c1 + (n2 - common) * c2;

        //Buy type 3 items only
        long costPrice3 = Math.max(n1 , n2) * cb;
        return Math.min(costPrice1, Math.min(costPrice2, costPrice3));
    }
}