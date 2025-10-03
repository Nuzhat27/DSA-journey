class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumedBottles = 0;
        while(numBottles >= numExchange){
            consumedBottles += numExchange;//Drink numExchange no of full bottles
            numBottles -= numExchange;//No of full bottles left after drinking numExchange number of bottles
            numBottles += 1;//Adding one becoz numExchange empty bottles can be exchanged to get one full bottle
        }
        //Consume the remaining numBottles 
        return consumedBottles + numBottles;
    }
}