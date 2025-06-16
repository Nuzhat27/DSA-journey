package Hashing;
import java.util.*;
public class highestOccuring {
    public static int mostFreqElement(int[] nums){
        int n , i , j , count=0 , maxFreq=0 , el=-1;
        n=nums.length;
        int max=0;
        for(i=0;i<n;i++){
            max = Math.max(max , nums[i]);
        }
        Map<Integer , Integer> freqMap = new HashMap<>();
        for(int num :nums){
           freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        return el;
    }
}