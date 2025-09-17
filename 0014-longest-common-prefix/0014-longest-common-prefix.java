class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort the array to get the lexicographically smallest and largest strings
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        /*int min = Math.min(first.length() , last.length());
        String ans = "" ;
        for(int i = 0 ; i < min ; i ++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            ans += first.charAt(i);
        }
        return ans ;*/
        int index = 0 ;
        while(index < first.length()){
            if(first.charAt(index) == last.charAt(index)){
                index++ ;
            }
            else{
                break;
            }
        }
        return index == 0 ? "" : first.substring(0 , index);
    }
}