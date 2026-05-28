class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int boats = 0 , left = 0 , right = n -1;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left ++;
            }
            right --;
            boats ++;
        }
        return boats;
    }
}
/*Heaviest person has two options:
  1. Pair with lightest → best possible partner (least weight)
  2. If even lightest is too heavy → must go alone

There's no better partner for the heaviest than the lightest.
Trying any other pairing would only waste space or add more boats. */