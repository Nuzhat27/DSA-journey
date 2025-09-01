class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a , b) -> Double.compare(b[0] , a[0]));
         int n = classes.length;

         //Push initial marginal gain for each class
         for(int i = 0 ; i < n ; i ++){
            double curr = (double) classes[i][0] / classes[i][1];
            double newPr = (double) (classes[i][0] + 1) / (classes[i][1] + 1);
            pq.offer(new double[]{newPr - curr , i});
         }

         //Distribute extra students
         while(extraStudents-- > 0){
            double[] top = pq.poll();
            int i = (int) top[1];
            classes[i][0] += 1;
            classes[i][1] += 1;
            int N = classes[i][0];
            int D = classes[i][1];
            double curr = (double) N / D;
            double newPr = (double) (N + 1) / (D + 1);
            pq.offer(new double[]{newPr - curr , i});
         }

         //compute the final average pass ratio
         double ans = 0.0;
         for(int[] c : classes){
            ans += (double) c[0]/c[1];
         }
         return ans/n;
    }
}