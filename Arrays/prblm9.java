package Arrays;
//Average of all elements in an array
import java.util.*;
public class prblm9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        findAverage(nums);
    }
    private static void findAverage(int[] nums){
        int sum = 0 ;
        double avg ;
        for(int num : nums){
            sum += num ;
        }
        avg = sum / nums.length;
        System.out.println("Average of all array elements is " + avg);
    }
}
