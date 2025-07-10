package Arrays;
import java.util.Scanner;

//Second Smallest and Second Largest element in an array
public class prblm3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        findSecondSmallest(nums);
        findSecondLargest(nums);
    }
    public static void findSecondSmallest(int[] nums){
        int i , n , smallest = Integer.MAX_VALUE , secondSmallest = Integer.MAX_VALUE;
        n = nums.length;
        for(i = 0 ; i < n ; i ++){
            if(nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            } else if(nums[i] != smallest && nums[i] < secondSmallest){
                secondSmallest = nums[i];
            }
        }
        System.out.println("Second smallest number in the array :-" + secondSmallest);
    }
    public static void findSecondLargest(int[] nums){
        int i , n , largest = Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;
        n = nums.length;
        for( i= 0 ; i < n ; i ++){
            if(nums[i] > largest) {
                secondLargest = largest ; 
                largest = nums[i];
            } else if(nums[i] != largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        System.out.println("Second largest number in the array :-" + secondLargest);
    }
}
