package Arrays;
//LC121. Best Time to Buy and Sell Stock
public class prblm16 {
    public int maxProfit(int[] prices) {
        /*int i , j ;
        int n = prices.length;
        for(i = 0 ; i < n ; i ++){
            for(j = i + 1 ; j < n ; j ++){
                profit = prices[j] - prices[i];
                maxProfit = Math.max(profit , maxProfit);
            }
        }*/
        int minPrice=Integer.MAX_VALUE , maxProfit = 0 ;
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            maxProfit = Math.max(maxProfit , price - minPrice);
        }
        return maxProfit;
    }
}
