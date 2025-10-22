//Check if a number is prime or not
class PrimeCheck{
	public boolean checkPrime(int num){
		if(n == 0 || n == 1) return false;
		return isPrime(num , 2);
	}
	private boolean isPrime(int num , int div){
		if(div > Math.sqrt(num)) return true;
		if(num % div == 0)return false;
		return isPrime(num , div + 1);
	}
}