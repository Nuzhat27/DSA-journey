class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, "", 0, 0, ans);
        return ans;
    }
    private void generate(int n, String st, int open, int close, List<String> ans){
        if(open + close == 2 * n && open == close){
            ans.add(st);
            return;
        }
        if(open < n){
            generate(n, st + '(' , open + 1, close, ans);
        }
        if(close < open){
            generate(n, st + ')' , open, close + 1, ans);
        }

    }
}