class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , price = prices[0];
        for(int curPrice : prices){
            int pr = curPrice - price;
            if(pr > 0){
                profit += pr;
            }
            price = curPrice;
        }
        return profit;
    }
}