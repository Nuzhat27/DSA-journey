/*Given a sorted array nums and an integer x.
 Find the floor and ceil of x in nums.
 The floor of x is the largest element in the array
 which is smaller than or equal to x.
 The ceiling of x is the smallest element in the array
 greater than or equal to x. If no floor or ceil exists, output -1.
 */
 class floorCeil{
	 public int[] getFloorAndCeil(int[] nums , int x){
		 int floor = getFloor(nums, x);
		 int ceil = getCeil(nums , x);
		 return new int[]{floor , ceil};
	 }
	 private int getFloor(int[] nums , int x){
		 int low = 0 , high = nums.length - 1 , mid , floor = -1;
		 while(low <= high){
			 mid = (low + high) / 2;
			 if(arr[mid] <= x){
				 floor = x;
				 low = mid + 1;
			 }
			 else high = mid - 1;
		 }
		 return floor;
	 }
	 private int getCeil(int[] nums , int x){
		 int low = 0 , high = nums.length - 1 , mid , ceil = -1;
		 while(low <= high){
			 mid = (low + high) / 2;
			 if(arr[mid] >= x){
				 ceil = x;
				 high = mid - 1 ;
			 }
			 else low = mid + 1;
		 }
		 return ceil;
	 }
 }