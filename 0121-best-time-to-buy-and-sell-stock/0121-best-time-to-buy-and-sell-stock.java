class Solution {
    public int maxProfit(int[] prices) {
        int i , j ,minPrice=Integer.MAX_VALUE , maxProfit = 0 ;
        int n = prices.length;
        /*for(i = 0 ; i < n ; i ++){
            for(j = i + 1 ; j < n ; j ++){
                profit = prices[j] - prices[i];
                maxProfit = Math.max(profit , maxProfit);
            }
        }*/
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            maxProfit = Math.max(maxProfit , price - minPrice);
        }
        return maxProfit;
    }
}