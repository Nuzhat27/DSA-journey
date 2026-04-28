class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> num = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                num.add(grid[i][j]);
            }
        }

        int base = num.get(0);
        for(int val : num){
            if((val - base) % x != 0) return -1;
        }

        Collections.sort(num);

        int size = num.size();
        int mid = size / 2;
        int med = num.get(mid);
        
        int ops = 0;
        for(int val : num){
            ops += Math.abs((val - med) / x);
        }

        return ops;
        
    }
}