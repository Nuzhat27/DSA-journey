//Sum of Array elements
class SumOfArray{
	public int arraySum(int[] nums){
		return findSum(nums , 0);
	}
	private int findSum(int[]nums , int index , int sum){
		if(index == nums.length) return sum;
		return nums[index] + findSum(nums , index + 1);
	}
}