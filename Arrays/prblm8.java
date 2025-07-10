package Arrays;
//Rotate array by K elements - Block Swap Algorithm
import java.util.*;
public class prblm8 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k :-");
        int k = sc.nextInt();
        rotateByK(nums , k);
        sc.close();
    }
    private static void rotateByK(int[] nums , int k){
        int n ;
        n = nums.length;
        if(k>n){
            k = k % n ;
        }
        /*Brute force approach 
        int[] arr = new int[n];
        for(i = k ; i < n ; i ++){
            arr[count] = nums[i];
            count ++;
        }
        for( i = 0 ; i < k ; i++){
            arr[count] = nums[i];
            count ++;
        }
        System.out.println("The array after rotation : - " );
        for(int num : arr){
            System.out.print( num + " ");
        }
        */
        if(k != 0 || k != n){
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);
        reverse(nums , 0 , n-1);
        }
        System.out.println("The array after rotation : - " );
        for(int num : nums){
            System.out.print( num + " ");
        }
    }
    private static int[] reverse(int[] nums , int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++ ;
            right -- ;
        }
        return nums;
    }
}
