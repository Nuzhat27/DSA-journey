class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        int n = s.length();
        StringBuilder current = new StringBuilder() ;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            }
            else if(ch == '['){
                countStack.push(count);
                stringStack.push(current);
                current = new StringBuilder();
                count = 0;
            }
            else if(ch == ']'){
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();
                while(repeat-- > 0){
                    previous.append(current);
                }
                current = previous ;
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}