class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int dis = 0 , lCount = 0 , rCount = 0 , count = 0;
        for(int i = 0 ; i < n ; i ++){
            if(moves.charAt(i) == 'L'){
                dis += -1;
                lCount += 1;
            }
            else if(moves.charAt(i) == 'R'){
                dis += 1;
                rCount += 1;
            }
            else{
                count += 1;
            }
        }
        if(rCount > lCount){
            dis += count;
        }
        else{
            dis -= count;
        }
        return Math.abs(dis);
    }
}