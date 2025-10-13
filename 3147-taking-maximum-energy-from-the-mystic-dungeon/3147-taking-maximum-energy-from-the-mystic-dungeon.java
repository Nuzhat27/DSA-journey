class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;
        for(int i = n - 1 ; i >= 0 ; i -- ){
            if(i + k < n){
                energy[i] += energy[i + k];
            }
        }
        for(int totalEnergy : energy){
            maxEnergy = Math.max(totalEnergy , maxEnergy);
        }
        return maxEnergy;
    }
}