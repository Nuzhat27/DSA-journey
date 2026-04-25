class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        int len = s.length();
        String pal = "";
        for(int i = 0 ; i < len ; i ++){
            if(Character.isLetterOrDigit(st.charAt(i))){
                pal += st.charAt(i);
            }
        }   
        int left = 0 , right = pal.length() - 1;
        while(left < right){
            if(pal.charAt(left) != pal.charAt(right)){
                return false;
            }
            left ++ ; 
            right --;
        }
        return true;
    }
}