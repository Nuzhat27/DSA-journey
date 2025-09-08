class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for (int i = 1; i < n; i++) {
            if (n - i < n) {
                if (isNoZero(i) && isNoZero(n - i)) {
                    return new int[] { i, n - i };
                }
            }
        }
        return new int[] {};
    }

    private boolean isNoZero(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d == 0)
                return false;
            n = n / 10;
        }
        return true;
    }
}