class Solution {
    public int numSub(String s) {
        final int modulo = 1000000007;
        int length = s.length();
        long count_1 = 0 , result = 0;;
        for(int i = 0 ; i < length ; i ++){
            if(s.charAt(i) == '1'){
                count_1 ++;
            }
            else{
                result += (count_1 * (count_1 + 1)) / 2;
                result %= modulo;
                count_1 = 0;
            }
        }
        result += (count_1 * (count_1 + 1)) / 2;
        result %= modulo;
        return (int)result;
    }
}