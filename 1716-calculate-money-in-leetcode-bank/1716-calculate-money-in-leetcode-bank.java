class Solution {
    public int totalMoney(int n) {
        int W , remDays;
        W = n / 7;
        remDays = n % 7;
        int WSum = 7* W * (W + 1) / 2 + 21 * W ;
        int remDaySum = remDays * W + remDays * (remDays + 1) / 2;
        return WSum + remDaySum;
    }
}