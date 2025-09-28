class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0)return "0";

        StringBuilder result = new StringBuilder();
        if(numerator < 0 ^ denominator < 0)result.append("-");

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        result.append(dividend / divisor);

        long remainder = dividend % divisor;
        if(remainder == 0)return result.toString();
        result.append(".");
        HashMap<Long , Integer> mpp = new HashMap<>();
        while(remainder != 0){
            if(mpp.containsKey(remainder)){
                result.insert(mpp.get(remainder) , "(");
                result.append(")");
                break;
            }
            mpp.put(remainder , result.length());
            remainder *= 10;
            result.append(remainder / divisor);
            remainder %= divisor;
        }

        return result.toString();
    }
}