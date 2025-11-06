import java.util.*;
class moveZeros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] belt = new int[n];
		for(int i = 0 ; i < n ; i ++){
			belt[i] = sc.nextInt();
		}
		int left = 0 ; 
		for(int i = 0 ; i < n ; i ++){
			if(belt[i] != 0){
				belt[left ++] = belt[i];
			}
		}
		for(int i = left ; i < n ; i ++){
			belt[i] = 0 ;
		}
		for(int i = 0 ; i < n ; i ++){
			System.out.print(belt[i] + " ");
		}
	}
}