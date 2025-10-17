class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character , Integer> mpp1 = new HashMap<>();
        HashMap<Character , Integer> mpp2 = new HashMap<>();
        int n = t.length();
        for(int i = 0 ; i < n ; i ++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(! mpp1.containsKey(c1)){
                mpp1.put(c1 , i);
            }
            if(! mpp2.containsKey(c2)){
                mpp2.put(c2 , i);
            }

            if(mpp1.get(c1) != mpp2.get(c2))return false;
        }
        return true;
    }
}