class Solution {
    public boolean doesAliceWin(String s) {
        int n = s.length();
        int vowelCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    return true;
            }
        }
        return false;
    }
}