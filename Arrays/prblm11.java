package Arrays;
import java.util.*;
//Remove Duplicates From an Unsorted Array
public class prblm11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        removeDuplicates(nums);
    }
    private static void removeDuplicates(int[] nums){
        int i , n ;
        n = nums.length;
        Map<Integer,Integer> elements = new HashMap<>();
        for(i= 0 ; i < n ; i ++){
            if(!elements.containsKey(nums[i])){
                System.out.print(nums[i]);
                elements.put(nums[i] , 1);
            }
        }
    }
}
