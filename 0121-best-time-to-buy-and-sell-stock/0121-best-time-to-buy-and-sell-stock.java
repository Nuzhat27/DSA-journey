class Solution {
    public int maxProfit(int[] prices) {
        int curPrice = prices[0] , maxProfit = 0;
        for(int price : prices){
            curPrice = Math.min(price, curPrice);
            maxProfit = Math.max(maxProfit, price - curPrice);
        }
        return maxProfit;
    }
}