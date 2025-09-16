class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        int n = nums.length;
        int top = -1;
        int[] stack = new int[n];
        for(int num : nums){
            while(top != -1){
                int x = getGCD(stack[top] , num);
                if(x == 1)break;
                else{
                    int peek = stack[top --];
                    long lcm = ((long)peek * num) / getGCD(peek , num);
                    num = (int)lcm ;
                }
            }
            stack[++top] = num;
        }
        List<Integer> result = new ArrayList<>();
        while(top != -1){
            result.add(stack[top --]);
        }
        Collections.reverse(result);
        return result;
    }

    private int getGCD(int n1, int n2) {
        while(n1 != 0 && n2 != 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else n2 = n2 % n1;
        }
        if(n1 == 0) return n2;
        return n1;
    }
}