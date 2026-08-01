class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int asteroid : asteroids){
            if(asteroid > 0){
                st.push(asteroid);
            }
            else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroid) > st.peek()){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroid) == st.peek()){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroid);
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int i = 0 ; i < ans.length  ; i ++){
            ans[i] = st.pop();
        }
        reverse(ans);
        return ans;
    }
    private void reverse(int[] arr){
        int left = 0 , right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;right--;
        }
    }
}