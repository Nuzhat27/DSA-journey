class Solution {
    public int minAddToMakeValid(String s) {
        int add = 0, open = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i ++){
            char c = s.charAt(i);
            if(c == '(')open ++;
            else{
                if(open > 0)open --;
                else add ++;
            }
        }
        return open + add;
    }
}