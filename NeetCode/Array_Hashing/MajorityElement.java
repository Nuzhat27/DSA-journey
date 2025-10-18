/*
Majority Element
Given an array nums of size n, 
return the majority element.
The majority element is the element that appears 
more than ⌊n / 2⌋ times in the array.
 You may assume that the majority element always exists in the array.
*/
SOLVED USING BOYER_MOORE VOTING ALGOERITHM
class MajorityElement{
	public int majorityElement(int[] nums){
		int res = 0  , count = 0;
		for(int num : nums){
			if(count == 0) res = num;
			count += (res == num) ? 1 : -1;
		}
		return res;
	}
}
