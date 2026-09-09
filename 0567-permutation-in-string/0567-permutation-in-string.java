class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if(n > m) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        for(int i = 0 ; i < n ; i ++){
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for(int i = 0 ; i < 26 ; i ++){
            if(s1Count[i] == windowCount[i]) matches ++;
        }
        if(matches == 26) return true;

        for(int i = n ; i < m ; i ++){
            int rightChar = s2.charAt(i) - 'a';
            int leftChar = s2.charAt(i - n) - 'a';

            //add right character into the current window
            windowCount[rightChar] ++;
            if(windowCount[rightChar] == s1Count[rightChar])matches++;
            else if(windowCount[rightChar] == s1Count[rightChar] + 1)matches --;
            
            //remove left character into the current window
            windowCount[leftChar] --;
            if(windowCount[leftChar] == s1Count[leftChar])matches++;
            else if(windowCount[leftChar] == s1Count[leftChar] - 1)matches --;

            if(matches == 26)return true;
        }
        return false;
    }
}