class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(!s.equals( "+") && !s.equals( "C") && !s.equals( "D")){
                st.push(Integer.parseInt(s));
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int x = st.peek();
                st.push(x * 2);
            }
            else{
                int x1 = st.pop();
                int x2 = st.peek();
                st.push(x1);
                st.push(x1 + x2);
            }
        }
        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}