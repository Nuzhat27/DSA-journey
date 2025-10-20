class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0 ;
        for(String op : operations){
            if(op.contains("+")){
                X += 1;
            }
            else X -= 1 ;
        }
        return X;
    }
}