package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find all non-repeating elements in an array
public class prblm14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        nonRepeating(nums);
        sc.close();
    }
    private static void nonRepeating(int[] nums){
        int n , i ;
        n = nums.length;
        Map<Integer , Integer> result = new HashMap<>();
        for(i = 0 ; i < n ; i ++){
            result.put(nums[i] , result.getOrDefault(nums[i] , 0)+1);
        }
        System.out.println("The non-repeating elements of the array are:-");
        for(var num : result.entrySet()){
            if(num.getValue() == 1){
                System.out.print(num.getKey() + " ");
            }
        }
    }
}
