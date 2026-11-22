class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        
        Arrays.sort(points, (a,b)-> Integer.compare(a[1], b[1]));

        int last = 0, arrows = 0;
        for(int i = 0 ; i < n; i ++){
            if(i == 0){
                arrows ++;
                last = points[i][1];
            }
            int start = points[i][0];
            if(start <= last)continue;
            else {
                arrows ++;
                last = points[i][1];
            }
        }
        return arrows;
    }
}