/*Airport security officials have confiscated several item of the passengers at the security check point.
 All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2].
 Here, the risk severity of the items represent an array[] of N number of integer values.
 The task here is to sort the items based on their levels of risk in the array.
 The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity */

package Misc;
import java.util.*;
class sort012{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] risk = new int[n];
		for(int i = 0 ; i < n ; i ++){
			risk[i] = sc.nextInt();
		}
		
		int low = 0 , mid = 0 , high = n - 1;
		while(mid <= high){
			if(risk[mid] == 0){
				int temp = risk[low];
				risk[low] = risk[mid];
				risk[mid] = temp;
				low ++;
				mid ++;
			} 
			else if(risk[mid] == 1){
				mid ++;
			}
			else{
				int temp = risk[high] ;
				risk[high] = risk[mid];
				risk[mid] = temp;
				high --;
			}
		}
		for(int i = 0 ; i < n ; i ++){
			System.out.print(risk[i] + " ");
		}
	}
}