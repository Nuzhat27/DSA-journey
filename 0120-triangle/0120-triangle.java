class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        for(int i = 1 ; i < m ; i ++){
            int val = triangle.get(i - 1).get(0) + triangle.get(i).get(0);
            triangle.get(i).set(0, val);
        }
        for(int i = 1; i < m ; i ++){
            for(int j = 1; j < i + 1; j ++){
                int up = (i > 0 && j != i)? triangle.get(i - 1).get(j) : Integer.MAX_VALUE;
                int dia = (j > 0)? triangle.get(i - 1).get(j- 1) : Integer.MAX_VALUE;
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(up, dia));  
            }
        }
        int ans = Integer.MAX_VALUE;
        List<Integer> lt = triangle.get(m - 1);
        for(int i = 0 ; i < lt.size(); i ++){
            ans = Math.min(ans, lt.get(i));
        }
        return ans;
    }
}