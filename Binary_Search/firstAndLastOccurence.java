/*Given an array of integers nums sorted in non-decreasing order,
 find the starting and ending position of a given target value.
 If the target is not found in the array, return [-1, -1].
 */
 class firstAndLastOccurence{
	 public int[] searchRange(int[] nums , int target){
		 int first = getFirstOccurence(nums, target);
		 int last = getLastOccurence(nums, target);
		 if(first == nums.length || nums[first] != target)return new int[]{-1, -1};
		 return new int[]{first , last - 1};
	 }
	 private int getFirstOccurence(int[] nums , int target){
		 int n = nums.length;
		 int low = 0 , high = n - 1 , mid , first = n;
		 while(low <= high){
			 mid = (low + high) / 2;
			 if(nums[mid] >= target){
				 first = mid;
				 high = mid - 1;
			 }
			 else low = mid + 1;
		 }
		 return first;
	 }
	 private int getFirstOccurence(int[] nums , int target){
		 int n = nums.length;
		 int low = 0 , high = n - 1 , mid , last = n;
		 while(low <= high){
			 mid = (low + high) / 2;
			 if(nums[mid] > target){
				 last = mid;
				 high = mid - 1;
			 }
			 else low = mid + 1;
		 }
		 return last;
	 }
 }