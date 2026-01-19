class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int boats = 0 , l = 0 , r = n - 1;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l ++;
                r --;
            }
            else{
                r --;
            }
            boats += 1;
        }
        return boats;
    }
}