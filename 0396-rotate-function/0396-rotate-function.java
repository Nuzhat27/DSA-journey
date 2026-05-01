class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0 , f0 = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i ++){
            sum += nums[i];
            f0 += (i * nums[i]);
        }

        int max = f0 , prev = f0;
        for(int i = 1 ; i < n ; i++){
            int curr = prev + sum - n * nums[n - i];
            max = Math.max(curr , max);
            prev = curr;
        }
        return max;
    }
}

    /*public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int maxRotationValue = -1;
        for(int i = 0 ; i < n ; i ++ )
        {
            int[] arrk = rotateByK(nums , i);
            int rotationVal = calVal(arrk);
            maxRotationValue = Math.max(rotationVal , maxRotationValue);
        }
        return maxRotationValue;
    }
    public static int[] rotateByK(int[] nums , int k){
        int n = nums.length;
        int[] res = nums.clone();
        reverse(res , 0 , n - 1 );
        reverse(res , 0 , k - 1);
        reverse(res , k , n - 1);
        return res;
    }
    public static int calVal(int[] nums){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            sum += (i * nums[i]);
        }
        return sum;
    }
    public static void reverse(int[] nums , int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left ++;
            right --;
        }
    }
} */