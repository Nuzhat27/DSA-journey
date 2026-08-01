class Solution {
    class Car{
        int pos;
        double time;
        Car(int pos, Double time){
            this.pos = pos;
            this.time = time;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for(int i = 0 ; i < n ; i ++){
            double time = (double)(target - position[i])/speed[i];
            cars[i] = new Car(position[i], time);
        }
        Arrays.sort(cars, (a,b)-> a.pos - b.pos);
        int fleets = 0;
        double lastTime = 0;
        for(int i = n - 1 ; i >= 0 ; i --){
            if(cars[i].time > lastTime){
                fleets ++;
                lastTime = cars[i].time;
            }
        }
        return fleets;
    }
}