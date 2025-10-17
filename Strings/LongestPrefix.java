//Longest Common Prefix
class LongestPrefix {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        int n = str.length;
        Arrays.sort(str);
        String prefix = "";
        String firstWord =(str[0].length() > str[n - 1].length())? str[n - 1] : str[0];
        for(int i = 0 ; i < firstWord.length() ; i ++){
            if(str[0].charAt(i) == str[n - 1].charAt(i)){
                prefix += str[0].charAt(i);
            }   
            else break;  
        }
        return prefix;
    }
}