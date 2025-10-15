//Reverse an array
class ReverseArray {
    public void reverse(int[] arr, int n) {
        int left = 0  , right = n - 1 ;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1; right -= 1;
        }
        
    }
}

