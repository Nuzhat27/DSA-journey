class Solution {
    public boolean isValid(String str) {
        int size = str.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < size ; i ++){
          if(str.charAt(i) == '(' || str.charAt(i) == '{'  || str.charAt(i) == '['){
            st.push(str.charAt(i));
          }
          else{
            if(st.isEmpty())return false;
            char ch = st.peek();
            st.pop();
            if(!isMatched(ch , str.charAt(i)))return false;
          }
        }
        return st.isEmpty();
    }
    private boolean isMatched(char st , char cl){
      if(cl == ')' && st == '(')return true;
      else if(cl == ']' && st == '[')return true;
      else if(cl == '}' && st == '{')return true;
      else return false;
    }
}