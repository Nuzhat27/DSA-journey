class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '(')stack.push(ch);
            else{
                if(stack.isEmpty())return false;
                char st = stack.pop();
                if(ch == '}' && st != '{' || ch == ']' && st != '[' || ch == ')' &&
                  st != '(')return false;
            }
        }
        return stack.isEmpty();
    }
}