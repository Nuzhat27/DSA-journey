class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals , (a , b) ->{
            if(b[1] == a[1]){
                return b[0] - a[0] ; //Sort the start points in descending order
            }
            return a[1] - b[1];//Sort the end points in ascending order
        });
        List<Integer> res = new ArrayList<>();
        res.add(intervals[0][1] - 1);
        res.add(intervals[0][1]);
        for(int i = 1 ; i < n ; i ++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int size = res.size();
            int last = res.get(size - 1);
            int secondLast = res.get(size - 2);
            if(start > last){
                res.add(end - 1);
                res.add(end);
            }
            else if(start == last){
                res.add(end);
            }
            else if(start > secondLast){
                res.add(end);
            }
        }
        return res.size();
    }
}