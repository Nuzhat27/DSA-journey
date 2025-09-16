class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int num : nums){
            while(!st.isEmpty()){
                int x = getGCD(st.peek() , num);
                if(x == 1)break;
                else{
                    int n = st.pop();
                    long lcm = ((long)n * num) / getGCD(n , num);
                    num = (int)lcm ;
                }
            }
            st.push(num);
        }
        List<Integer> result = new ArrayList<>();
        while(!st.isEmpty()){
            result.add(st.pop());
        }
        Collections.reverse(result);
        return result;
    }

    private int getGCD(int n1, int n2) {
        return n2 == 0 ? n1 : getGCD(n2, n1 % n2);
    }
}