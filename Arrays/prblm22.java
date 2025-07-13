package Arrays;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class prblm22 {
    public void moveZeroes(int[] nums) {
        int i = 0 , j ;
        for(j = 0 ; j < nums.length ; j ++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i ++;
            }
        }
    }
}
