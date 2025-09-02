class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;
        Arrays.sort(points , (a,b) -> {
            if(a[0] == b[0])return Integer.compare(b[1] , a[1]);
            else return Integer.compare(a[0] , b[0]);
        });

        for(int i = 0 ; i < n  ; i ++){
            int top = points[i][1];//y-coordinate of point A
            int bot = Integer.MIN_VALUE;

            for(int j = i + 1 ; j < n ; j ++){
                int y = points[j][1];

                if(y <= top && bot < y){
                    count ++;
                    bot = y;
                }
            }
        }
        return count;
    }
}