//Count of odd numbers in array

class OddCount{
    public int countOdd(int[] arr, int n) {
        int count = 0;
       for(int num : arr){
        if(num % 2 != 0 )count += 1;
       }
       return count;
    }
}