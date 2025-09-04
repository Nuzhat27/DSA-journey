class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        for(int i = 0 ; i < size ; i ++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')stack.push(ch);
            else{
                if(stack.isEmpty())return false;
                char st = stack.peek();
                stack.pop();
                if(!isMatched(st , ch))return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean isMatched(char st , char cl){
        if(cl == '}' && st == '{')return true;
        else if(cl == ']' && st == '[')return true;
        else if(cl == ')' && st == '(')return true;
        else return false;
    }
}