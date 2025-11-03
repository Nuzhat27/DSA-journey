class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = neededTime.length;
        char[] c = colors.toCharArray();
        int time = 0; int maxTime = neededTime[0];
        for(int i = 1 ; i < c.length; i ++){
            if(c[i - 1] == c[i]){
                time += Math.min(maxTime , neededTime[i]);
                maxTime = Math.max(maxTime , neededTime[i]);
            }
            else{
                maxTime = neededTime[i];
            }
        }
        return time;
    }
}