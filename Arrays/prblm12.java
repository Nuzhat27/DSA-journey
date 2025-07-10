package Arrays;
//Adding Element in an array
import java.util.*;
public class prblm12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers of the array:-");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be added:-");
        int num = sc.nextInt();

        System.out.println("Enter 1 to add the number in beginning .");
        System.out.println("Enter 2 to add the number at the end of the array . ");
        System.out.println("Enter 3 to add the number at specific index . ");
        int process = sc.nextInt();
        switch(process){
            case 1:addBegin(nums , num);
            break;
            case 2:addLast(nums , num);
            break;
            case 3:System.out.println("Enter the index where you want to add the number:-");
                int index = sc.nextInt();
                addAtIndex(nums , num , index);
                break;
            default:return;
        }     
        sc.close();
    }
    private static void addBegin(int[] nums , int num){
        int i , n ;
        n = nums.length;
        List<Integer> result = new ArrayList<>();
        result.add(num);
        System.out.print(num + " ");
        for(int number : nums){
            result.add(number);
            System.out.print(number + " ");
        }
    }
    private static void addLast(int[] nums , int num){
        int i , n ;
        n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int number : nums){
            result.add(number);
            System.out.print(number + " ");
        }
        result.add(num);
        System.out.print(num + " ");
    }
    private static void addAtIndex(int[] nums , int num , int index){
        int i , n ;
        n = nums.length;
        List<Integer> result = new ArrayList<>();
        for(i = 0 ; i < n ; i ++){
            if(index == i){
                result.add(num);
                System.out.print(num + " ");
            }
            result.add(nums[i]);
            System.out.print(nums[i] + " ");
        }
    }
}
