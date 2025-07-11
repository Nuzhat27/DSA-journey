package Arrays;
//Search an element in an array
import java.util.*;

public class prblm15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element of the array:-");
        for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:-");
        int num = sc.nextInt();
        searchElement(nums , num);
        sc.close();
    }
    private static void searchElement(int[] nums , int ele){
        boolean found = false;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == ele){
                found = true;
            }
        }
        if(found == true){
            System.out.println("Element exist");
        }else{
            System.out.println("Element doesnot exist");
        }
    }
}

