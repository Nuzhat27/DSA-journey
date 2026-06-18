class Solution {
    public int uniquePaths(int m, int n) {
        int[] aboveRow = new int[n];
        Arrays.fill(aboveRow , 1);//There is only one way to reach the top cells of the first row
        for(int i = 1 ; i < m ; i ++){
            int[] currentRow = new int[n];
            currentRow[0] = 1;//There is only one way to reach the leftmost column(by going down !!!)
            for(int j = 1 ; j < n ; j ++){
                currentRow[j] = aboveRow[j] + currentRow[j - 1];
            }
            aboveRow = currentRow;
        }
        return aboveRow[n - 1];
        /*
        int[] prev = new int[n];
        for(int i = 0 ; i < m ; i ++){
            int[] temp = new int[n];
            for(int j = 0 ; j < n ; j ++){
                if(i == 0 && j == 0){
                    temp[j] = 1;
                    continue;
                }
                int up = (i > 0)?prev[j] : 0;//
                int left = (j > 0)? temp[j - 1] : 0;
                temp[j] = up + left;
            }
            prev = temp;
        }
        return prev[n - 1];
        */
    }
}