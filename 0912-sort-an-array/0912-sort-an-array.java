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
    private void merge(int[] nums , int p , int q , int r){
        List<Integer> temp = new ArrayList<>();
        int left = p ;
        int right = q + 1;
        while(left <= q && right <= r){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left += 1; 
            }
            else{
                temp.add(nums[right]);
                right += 1;
            }
        }
        while(left <= q){
            temp.add(nums[left]);
            left += 1;
        }
        while(right <= r){
            temp.add(nums[right]);
            right += 1;
        }
        for(int i = p ; i <= r ; i ++){
            nums[i] = temp.get(i - p);
        }
    }
}