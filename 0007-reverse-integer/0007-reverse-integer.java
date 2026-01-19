class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
            x = Math.abs(x);
        }
        int rev = 0;
        while(x > 0){
            int lastDigit = x % 10;
            x = x / 10;
            // check overflow before it happens
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastDigit > 7)) 
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastDigit < -8)) 
                return 0;
            rev = (rev * 10) + lastDigit;
        }
        if(neg == true){
            rev = - rev;
        }
        return rev;
    }
}