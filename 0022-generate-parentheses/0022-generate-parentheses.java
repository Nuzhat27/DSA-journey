class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        String ans = "";
        int open = 0 , close = 0;
        generate(open, close, ans, res, n);
        return res;
    }
    private void generate(int open, int close, String ans, List<String> res, int n){
        if(open + close == 2 * n && open == close){
            res.add(ans);
            return;
        }
        if(open < n){
            generate(open + 1, close, ans + "(", res, n);
        }
        if(close < open){
            generate(open, close + 1, ans + ")" , res, n);
        }
    }
}