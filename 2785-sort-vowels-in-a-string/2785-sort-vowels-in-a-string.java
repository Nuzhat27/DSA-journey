class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        char[] ans = new char[n];
        List<Character> vowels = new ArrayList<>();

        for(int i = 0 ; i < n ; i ++){
            char ch = s.charAt(i);
            if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                ans[i] = ch;
            }
            else{
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        int index = 0;
        for(int i = 0 ; i < n ; i ++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ans[i] = vowels.get(index++);
            }
        }
        return new String(ans);
    }
}