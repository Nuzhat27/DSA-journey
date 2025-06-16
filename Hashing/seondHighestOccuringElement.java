package Hashing;

import java.util.HashMap;
import java.util.Map;

public class seondHighestOccuringElement {
    public static int secondMostFrequentElement(int[] nums) {
        int count , el1Freq=0 , el2Freq=0 ,el1=-1,el2=-1;
        Map<Integer ,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        for(var entry : freq.entrySet()){
            int val= entry.getKey();
            count=entry.getValue();
            if(count>el1Freq){
                el2=el1;
                el2Freq=el1Freq;
                el1=val;
                el1Freq=count;
            }
            else if(count>el2Freq && count<el1Freq){
                el2Freq=count;
                el2=val;
            }
            else if(count==el2Freq && val<el2){
                el2=val;
            }
            else if(count==el1Freq && val<el1){
                el1=val;
            }
            
        }
        return el2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        secondMostFrequentElement(nums);
    }
}
