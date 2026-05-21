class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int cheapest = prices[0];
        left[0] = 0;
        for(int i = 1 ; i < n ; i ++){
            cheapest = Math.min(cheapest , prices[i]);
            left[i] = Math.max(left[i - 1] , prices[i] - cheapest);
        }

        int priciest = prices[n - 1];
        right[n - 1] = 0;
        for(int i = n - 2 ; i >= 0 ; i --){
            priciest = Math.max(prices[i] , priciest);
            right[i] = Math.max(right[i + 1] , priciest - prices[i]);
            
        }

        int maxProfit = left[n - 1];
        for(int i = 0 ; i < n - 1 ; i ++){
            maxProfit = Math.max(maxProfit , left[i] + right[i + 1]);
        }

        return maxProfit;
    }
}