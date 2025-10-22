//Sum of digits in a given number
class SumOfDigits{
	public int addDigits(int num){
		if(num < 10) return num;
		int sum = findSum(num);
		return addDigits(sum);
	}
	private int findSum(int num){
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
	}
}