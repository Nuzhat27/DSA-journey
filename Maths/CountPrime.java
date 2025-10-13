//Count of Prime Numbers till N
class CountPrime{
	public int primeUptoN(int n){
		if(n < 2 ) return false;
		int count = 0;
		for(int i = 2 ; i <= n ; i ++){
			if(isPrime(i)) count += 1;
		}
		return count;
	}
	private boolean isPrime(int n ){
		for(int i = 2 ; i*i <= n ; i ++){
			if(n % i == 0)return false;
		}
		return true;
	}
}