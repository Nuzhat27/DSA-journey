package Arrays;
//Find all Symmetric Pairs in the array of pairs
import java.util.*;

public class prblm14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        System.out.println("Enter the pairs of the array:-");
        for(int i = 0 ; i < n ; i++){
                nums[i][0] = sc.nextInt();
                nums[i][1] = sc.nextInt();
        }
        symmetricPair(nums);
        sc.close();
    }
    private static void symmetricPair(int[][] nums){
        Map<Integer , Integer> pairs = new HashMap<>();
        for(int[] pair : nums){
            int a = pair[0];
            int b = pair[1];
            if(pairs.containsKey(b) && pairs.get(b) == a){
                System.out.println("(" + a + ", " + b + ")");
            }
            else{
                pairs.put(a,b);
            }
        }
    }
}

