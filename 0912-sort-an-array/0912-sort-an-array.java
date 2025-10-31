class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
        return nums;
    }

    private void mergeSort(int[] nums , int p , int r){
        if(p >= r) return;
        int q = (p + r) / 2;
        mergeSort(nums , p , q);
        mergeSort(nums , q + 1 , r);
        merge(nums , p , q , r);
    }
    private void merge(int[] nums , int left , int mid , int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];
        
    }
}