class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String x : tokens){
            if(x.equals("+")){
                int a = (int)st.pop();
                int b = (int)st.pop();
                int c = a + b;
                st.push(c);
            }
            else if(x.equals("-")){
                int a = (int)st.pop();
                int b = (int)st.pop();
                int c = b - a;
                st.push(c);
            }
            else if(x.equals("*")){
                int a = (int)st.pop();
                int b = (int)st.pop();
                int c = a * b;
                st.push(c);
            }
            else if(x.equals("/")){
                int a = (int)st.pop();
                int b = (int)st.pop();
                int c = b / a;
                st.push(c);
            }
            else{
                st.push(Integer.parseInt(x));
            }
        }
        return st.peek();
    }
}