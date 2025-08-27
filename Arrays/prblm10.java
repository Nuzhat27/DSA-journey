package Arrays;
//Remove duplicates from a sorted array
import java.util.*;
public class prblm10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        removeDuplicates(nums);
        sc.close();
    }
    private static void removeDuplicates(int[] nums){
        //Brute force using HashSet
        /*Set<Integer> elements = new HashSet<>();
        for(int num : nums){
            elements.add(num);
        }*/
        //Optimal approach using two pointers
        int i = 0 , j , n;
        n = nums.length;
        for(j = 1 ; j < n ; j ++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        for(j = 0 ; j <= i ; j ++){
            System.out.print(nums[j] + " ");
        }
    }           
}
