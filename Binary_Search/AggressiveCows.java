/*Given an array nums of size n, which denotes the positions of stalls, and an integer k,
 which denotes the number of aggressive cows, assign stalls to k cows such that
 the minimum distance between any two cows is the maximum possible. Find the maximum possible minimum distance.*/
class AggressiveCows {
  public int aggressiveCows(int[] nums, int k) {
    int n = nums.length;
    Arrays.sort(nums);
    int limit = nums[n - 1] - nums[0];
    int low = 1, high = limit, mid;
    while (low <= high) {
      mid = (low + high) / 2;
      if (canWePlace(nums, mid, k) == true) {
        low = mid + 1;
      } else high = mid - 1;
    }
    return high;
  }

  private boolean canWePlace(int[] nums, int d, int k) {
    int n = nums.length;
    int cowCount = 1, last = nums[0];
    for (int i = 1; i < n; i++) {
      if (nums[i] - last >= d) {
        cowCount++;
        last = nums[i];
      }
      if (cowCount >= k) return true;
    }
    return false;
  }
}
