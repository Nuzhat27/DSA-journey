class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int consumedBottles = 0;
        while(numBottles >= numExchange){
            consumedBottles += numExchange;
            numBottles -= numExchange;
            numBottles += 1;
            numExchange += 1;
        }
        return numBottles + consumedBottles;
    }
}