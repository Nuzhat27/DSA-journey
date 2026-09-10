class Solution {
    public String minWindow(String s, String t) {
        int a = s.length(), b = t.length();

        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        
        HashMap<Character, Integer> tCount = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int l = 0, have = 0, need = tCount.size();
        for(int r = 0 ; r < a ; r ++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c , 0) + 1);
            if(tCount.containsKey(c) && window.get(c).equals(tCount.get(c))){
                have ++;
            }
            while(have == need){
                if((r - l + 1) < resLen){
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
                    char left = s.charAt(l);
                    window.put(left, window.get(left) - 1);
                    if(tCount.containsKey(left) && window.get(left) < tCount.get(left)){
                        have --;
                    }
                    l ++;
                }
        }   
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}