class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] sArray = s.toCharArray();
        
        for(int i = 1 ; i <= n - 2 ; i ++){
            for(int j = 0 ; j < n - 1 ; j ++){
                int dig1 = sArray[j] - '0';
                int dig2 = sArray[j + 1] - '0';
                sArray[j] = (char)(((dig1 + dig2) % 10) + '0');
            }
        }
        return sArray[0] == sArray[1];
    }
}