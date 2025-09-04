class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1 , diff2;
        diff1 = (x>z)? x-z : z-x ;
        diff2 = (y>z)? y-z : z-y ;
        if(diff1 > diff2)return 2;
        else if(diff1 == diff2)return 0;
        else return 1;
    }
}