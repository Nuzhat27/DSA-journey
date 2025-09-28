//Count number of odd digits in a number
class oddDigits{
	public int countDigit(int n ){
		int count = 0;
		while(n > 0){
			int digit = n % 10;
			if(digit % 2 != 0)count += 1;
			n = n / 10;
		}
		return count;
	}
}