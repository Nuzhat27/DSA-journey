class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        long ans = 1;
        for(int i = 1 ; i <= rowIndex ; i ++){
            ans = ans * (rowIndex - i + 1);
            ans = ans / i;
            res.add((int)ans);
        }
        return res;
    }
}