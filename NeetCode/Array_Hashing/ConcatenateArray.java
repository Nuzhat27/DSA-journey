/*Concatenation of Array
You are given an integer array nums of length n. 
Create an array ans of length 2n where ans[i] == nums[i] 
and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans. */
class ConcatenateArray{
	public int[] getConcatenation(int[] nums){
		int[] ans = new int[2 * n];
		for(int i = 0 ; i < 2 * n ; i ++){
			ans[i] = nums[i % n];
		}
		return ans;
	}
}