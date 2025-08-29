package Misc;
import java.util.*;
//Consecutive prime sum
class consecutivePrimeSum{
	public static List<Integer> sieveOfErastothenes(int limit){
		boolean[] isPrime = new boolean[limit+1];
		Arrays.fill(isPrime,true);
		isPrime[0] = false;
		isPrime[1] = false;
		
		List<Integer> primes = new ArrayList<>();
		
		for(int i = 2 ; i*i <= limit ; i ++){
			if(isPrime[i]){
				for(int j = i*i ; j <= limit ; j+=i){
					isPrime[j] = false;
				}
			}
		}
		for(int i = 2 ; i <= limit ; i++){
			if(isPrime[i]){
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static int findConsecutivePrimeSum(int N){
		List<Integer> primes = sieveOfErastothenes(N);
		
		HashSet<Integer>  primeSet = new HashSet<>(primes);
		
		int count = 0 ;
		long currentSum = 0 ;
		for(int right = 0 ; right < primes.size() ; right++){
			currentSum += primes.get(right);
			while(currentSum > N){
				break;
			}
			if(primeSet.contains((int)currentSum) && currentSum > 2){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number N");
		int N = sc.nextInt();
		int count = findConsecutivePrimeSum(N);
		System.out.println(count);
		sc.close();
	}
}