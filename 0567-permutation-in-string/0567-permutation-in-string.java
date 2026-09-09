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
        if(Arrays.equals(s1Count, windowCount)) return true;

        for(int i = n ; i < m ; i ++){
            int rightChar = s2.charAt(i) - 'a';
            int leftChar = s2.charAt(i - n) - 'a';

            //add right character into the current window
            windowCount[rightChar] ++;
            
            //remove left character into the current window
            windowCount[leftChar] --;

            if(Arrays.equals(s1Count, windowCount)) return true;
        }
        return false;
    }
}