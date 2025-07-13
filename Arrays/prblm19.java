package Arrays ;
/*
 LC35 :-Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
 */
public class prblm19 {
    public int searchInsert(int[] nums, int target) {
        int i = 0 ; 
        boolean found = false ;
        while(i < nums.length && nums[i] <= target ){
            if(nums[i] == target){
                found = true ;
                return i ;
            }
            i ++ ;
        }
        return i ;
    }
}
