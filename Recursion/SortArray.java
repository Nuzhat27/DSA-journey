//Check if the array is sorted
class SortArray{
	public boolean isSorted(ArrayList<Integer> nums){
		return check(nums , 1);
	}
	private boolean check(ArrayList<Integer> nums , int index){
		if(index == nums.size())return true;
		if(nums.get(index - 1) > nums.get(index)) return false;
		return check(nums , index + 1);
	}
}