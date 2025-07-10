package Arrays;
import java.util.*;
//Reverse a given array
public class prblm4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        reverseArray(nums);
        sc.close();
    }   
    public static void reverseArray(int[] nums){
        int n , left , right;
        n = nums.length;
        left = 0 ;
        right = n-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
