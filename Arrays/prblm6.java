package Arrays;
import java.util.*;
//Rearrange array in increasing-decreasing order
public class prblm6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        arrangeIncreasingDecreasingOrder(nums);
        sc.close();
    }
    private static void arrangeIncreasingDecreasingOrder(int[] nums){
        Arrays.sort(nums);
        int i , n ;
        n = nums.length ;
        for(i = 0 ; i < n/2 ; i ++){
            System.out.print(nums[i] + " ");
        }
        for(i = n-1 ; i >= n/2 ; i --){
            System.out.print(nums[i] + " ");
        }
    }
}
