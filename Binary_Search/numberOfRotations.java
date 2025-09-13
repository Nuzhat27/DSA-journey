//Find the number of times the array is rotated
class numberOfRotations {
  public int findKRotation(ArrayList<Integer> nums) {
    int low = 0, mid, high = nums.size() - 1 , min = Integer.MAX_VALUE , index = -1 ;
    while (low <= high) {
      mid = (low + high) / 2;
      if(nums.get(low) <= nums.get(high)){
        if(nums.get(low) < min){
            index = low;
            min = nums.get(low);
        }
        break;
      }
      if (nums.get(low) <= nums.get(mid)) {
        // Left half is sorted
        if(nums.get(low) < min){
            index = low;
            min = nums.get(low);
        }
        low = mid + 1;
      }
      else{
        //Right half is sorted
        if(nums.get(mid) < min){
            index = mid;
            min = nums.get(mid);
        }
        high = mid - 1;
      }
    }
    return index;
  }
}
