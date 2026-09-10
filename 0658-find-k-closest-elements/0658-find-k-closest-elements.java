class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k;//r is the last valid starting index
        while(l < r){
            int m = (l + r) / 2;
            if(x - arr[m] > arr[m + k] - x){
                l = m + 1;//shift the window right
            }
            else r = m;//m is still a valid starting index
        }
        List<Integer> result = new ArrayList<>();
        for(int i = l ; i < l + k ; i ++)result.add(arr[i]);
        return result;
    }
}