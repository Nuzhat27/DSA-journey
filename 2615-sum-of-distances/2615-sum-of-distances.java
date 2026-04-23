class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        /*for(int i = 0 ; i < n ; i ++){
            long res = 0;
            for(int j = 0 ; j < n ; j ++){
                if(j != i && nums[j] == nums[i]){
                    res += Math.abs(i - j);
                }
            }
            arr[i] = (res == 0) ? 0 : res;
        }
        return arr; */
        HashMap<Integer , ArrayList<Integer>> indx = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            indx.computeIfAbsent(nums[i] , k -> new ArrayList<>()).add(i);
        }

        for(List<Integer> pos : indx.values()){
            long sum = 0;
            for(int x : pos){
                sum += x;
            }

            long leftSum = 0 ;
            int m = pos.size();

            for(int i = 0 ; i < m ; i ++){
                long rightSum = sum - leftSum - pos.get(i);

                long left = (long) pos.get(i) * i - leftSum;
                long right = rightSum - (long)pos.get(i) * (m - i - 1);

                arr[pos.get(i)] = left + right;

                leftSum += pos.get(i);
            }
        }
        return arr;
    }
}
/*
// VARIABLE REFERENCE
//
// n          → total length of the nums array
//
// ans        → final answer array. ans[i] = total distance for index i
//
// mp         → groups positions by value. e.g. {1 → [0,2,3], 3 → [1,4]}
//
// pos        → list of positions for the one group we are currently working on
//
// m          → how many elements are in the current group (pos.size())
//
// sum        → sum of ALL positions in the current group
//
// leftSum    → running total of positions already visited (to the left of current)
//
// rightSum   → sum of positions still to the right = sum - leftSum - pos[i]
//
// left       → total distance from current position to all left elements
//
// right      → total distance from current position to all right elements
//
// i          → loop index inside pos. ALSO tells you how many elements are to the left
//
// pos.get(i) → the actual index in the original nums array we are currently at
//
//
// TWO THINGS TO REMEMBER
//
// 1. i does double duty → it is the loop counter AND the count of left elements
//
// 2. leftSum updates at the END of each loop iteration → so during the
//    calculation it only reflects elements before current, not including it
*/