package Practice;
//Find the largest number in the array
import java.util.*;
public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        findLargest(nums);
    }
    public static void findLargest(int[] nums){
        int n , i , largestNum = Integer.MIN_VALUE;
        n = nums.length;
        for(i = 0 ; i < n ; i ++){
            if(nums[i] > largestNum){
                largestNum = nums[i];
            }
        }
        System.out.println("Largest number in the array is " + largestNum);
    }
}
