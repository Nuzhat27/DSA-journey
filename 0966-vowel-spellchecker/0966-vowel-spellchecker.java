class Solution {
    Set<String> words_perfect;
    Map<String , String> words_cap;
    Map<String , String> words_vow;
    public String[] spellchecker(String[] wordlist, String[] queries) {
        words_perfect = new HashSet<>();
        words_cap = new HashMap<>();
        words_vow = new HashMap<>();

        for(String word : wordlist){
            words_perfect.add(word);

            String wordLow = word.toLowerCase();
            words_cap.putIfAbsent(wordLow , word);

            String wordDVow = devowel(wordLow);
            words_vow.putIfAbsent(wordDVow , word);

        }

        String[] ans = new String[queries.length];
        int t = 0;
        for(String query : queries){
            ans[t++] = solve(query);
        }
        return ans;
    }

    public String solve(String query){
        if(words_perfect.contains(query)) return query; //Perfect word match

        String queryLC = query.toLowerCase();
        if(words_cap.containsKey(queryLC))return words_cap.get(queryLC); //Capitilization;

        String queryLV = devowel(queryLC);
        if(words_vow.containsKey(queryLV))return words_vow.get(queryLV);

        return "";
    }
    public String devowel(String word){
        StringBuilder ans = new StringBuilder();
        for(char c : word.toCharArray()){
            ans.append(isVowel(c)? '*' : c);
        }
        return ans.toString();
    }

    public boolean isVowel(char c){
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}