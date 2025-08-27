package Arrays;
import java.util.*;
//Count frequency of each element in an array
class prblm5{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        findCount(nums);
        sc.close();
    }
    private static void findCount(int[] nums){
        Map<Integer , Integer> count = new HashMap<>(); 
        for(int num : nums){
            count.put(num , count.getOrDefault(num , 0) +1);
        }
        for(var num : count.entrySet()){
            System.out.println("Count of " + num.getKey() + " is " + num.getValue() );
        }
    }
}