//Count all digits of a number
class numberOfDigits{
    public int countDigit(int n) {
        int numDigits = 0;
        if(n == 0)numDigits += 1;
        while(n > 0){
            n = n / 10;
            numDigits += 1;
        }
        return numDigits;
    }
}