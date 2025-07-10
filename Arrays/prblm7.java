package Arrays;
//Calculate sum of the elements of the array
import java.util.*;
public class prblm7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        calculateSum(nums);
        
    }
    private static void calculateSum(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        System.out.println("The sum of the given array is " + sum);
    }
}
