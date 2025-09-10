/*
Celebrity Problem
*/
//Brute Force
class 0227-Find-the-Celebrity {
    public int celebrity(int[][] M) {
      int n = M.length;
      int[] knowMe = new int[n];
      int[] iKnow = new int[n];

      for(int i = 0 ; i < n ; i ++){
        for(int j = 0 ; j < n ; j ++){
            if(M[i][j] == 1){
                iKnow[i] ++;
                knowMe[j] ++;
            }
        }
      } 
      for(int i = 0 ; i < n ; i ++){
            if(knowMe[i] == n - 1 && iKnow[i] == 0){
                return i;
            }
        }
      return -1;
    }
}
//Two pointer approach - optimal
class Solution {
  public int celebrity(int[][] M) {
    int n = M.length;
    int top = 0, down = n - 1;
    while (top < down) {
      // If top knows down then top cant be celebrity
      if (M[top][down] == 1) {
        top += 1;
      }
      // If down knows top then down cant be celebrity
      else if (M[down][top] == 1) {
        down -= 1;
      } else {
        top += 1;
        down -= 1;
      }
    }
    if (top > down) return -1;

    for (int i = 0; i < n; i++) {
      if (i == top) {
        continue;
      }
      // If M[top][i]==1 if top knows i then top is not celebrity
      // If M[i][top] == 0 then i doesnot know top therefore top cannot be celebrity
      if (M[top][i] == 1 || M[i][top] == 0) {
        return -1;
      }
    }
    return top;
  }
}
