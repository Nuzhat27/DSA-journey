package Arrays;
//Find the smallest number in an array
import java.util.*;
public class prblm1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        findSmallest(nums);
    }
    public static void findSmallest(int[] nums){
        int n , i , smallestNum = Integer.MAX_VALUE;
        n = nums.length ;
        for( i = 0 ; i < n ; i ++){
            if(nums[i] < smallestNum){
                smallestNum = nums[i];
            }
        }
        System.out.println("Smallest number in array :- " + smallestNum);
    }
}
