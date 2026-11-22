class Solution {
    public boolean checkString(String s) {
        /*int n = s.length();
        int lastIdx = -1;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == 'a')lastIdx = i;
        }
        if(lastIdx == -1)return true;
        boolean check = true;
        for(int i = 0; i <= lastIdx; i ++){
            if(s.charAt(i) == 'b'){
                check = false;
                break;
            }
        }
        return check;*/
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;
    }
}