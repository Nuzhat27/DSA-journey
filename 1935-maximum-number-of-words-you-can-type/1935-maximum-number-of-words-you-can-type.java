class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        for(int i = 0 ; i < brokenLetters.length() ; i ++){
            broken.add(brokenLetters.charAt(i));
        }
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
            boolean canType = true;
            for(int i = 0 ; i < word.length() ; i ++){
                if (broken.contains(word.charAt(i))){
                    canType = false;
                    break;
                }
            }
            if(canType)count ++;
        }
        return count;
    }
}