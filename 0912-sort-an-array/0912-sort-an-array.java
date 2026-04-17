class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums , 0 , n - 1);
        return nums;
    }
    public static void mergeSort(int[] nums , int p , int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(nums , p , q );
            mergeSort(nums , q + 1, r);
            merge(nums, p , q , r);
        }
    }
    public static void merge(int[] nums , int low , int mid , int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[mid]){
                ans.add(nums[left]);
                left ++;
            }
            else {
                ans.add(nums[right]);
                right ++;
            }
        }
        while(left <= mid){
            ans.add(nums[left]);
            left += 1;
        }
        while(right <= high){
            ans.add(nums[right]);
            right += 1;
        }
        for(int i = low ; i < high ; i ++){
            nums[low] = ans.get(i - low);
        }
        
    }
}