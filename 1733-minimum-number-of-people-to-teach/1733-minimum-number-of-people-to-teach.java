class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        boolean[][] knowLanguage = new boolean[m+1][n+1];
        /*Iterate through languages array to map the users with languages they know */
        for(int i = 0 ; i < m ; i ++){
            //Iterate through the languages known by user 
            for(int lang : languages[i]){
                knowLanguage[i+1][lang] = true;
            }
        }

        Set<Integer> cantCommunicate = new HashSet<>();

        for(int[] friend : friendships){
            int u = friend[0];
            int v = friend[1];
            if(!canCommunicate(knowLanguage , u , v , n)){
                cantCommunicate.add(u);
                cantCommunicate.add(v);
            }
        }
        //If everyone can already communicate there is no need for teaching
        if(cantCommunicate.isEmpty()){
            return 0;
        }

        int maxKnown = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j : cantCommunicate) {
                if (knowLanguage[j][i]) {
                    count++;
                }
            }
            maxKnown = Math.max(maxKnown, count);
        }
        return cantCommunicate.size() - maxKnown;
    }
    private boolean canCommunicate(boolean[][] knowLanguage , int u , int v , int n){
        for(int i = 1 ; i <= n ; i ++){
            if(knowLanguage[u][i] && knowLanguage[v][i]){
                return true;
            }
        }
        return false;
    }
}