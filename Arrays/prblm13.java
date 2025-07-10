package Arrays;
//Find all repeating elements in an array
import java.util.*;
public class prblm13 {
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
        repeating(nums);
    }
    private static void repeating(int[] nums){
        int n , i ;
        n = nums.length;
        Map<Integer , Integer> result = new HashMap<>();
        for(i = 0 ; i < n ; i ++){
            result.put(nums[i] , result.getOrDefault(nums[i] , 0)+1);
        }
        for(var num : result.entrySet()){
            if(num.getValue() > 1){
                System.out.print(num.getKey() + " ");
            }
        }
    }
}
