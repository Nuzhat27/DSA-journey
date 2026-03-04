class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0] , profit = 0;
        for(int curPrice : prices){
            profit = Math.max(profit , curPrice - price );
            price = Math.min(price , curPrice);
        }
        return profit;
    }
}