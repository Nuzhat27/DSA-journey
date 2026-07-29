class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, curPrice = Integer.MAX_VALUE;
        for(int price : prices){
            curPrice = Math.min(curPrice, price);
            profit = Math.max(profit, price - curPrice);
        }
        return profit;
    }
}