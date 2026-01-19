class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0 , cnt2 = 0 , num1 = -1 , num2 = -1;
        for(int num : nums){
            if(num == num1) {
                cnt1 ++;
            }
            else if(num == num2){
                cnt2 ++;
            }
            else if(cnt1 == 0 && num != num2){
                cnt1 = 1;
                num1 = num;
            }
            else if(cnt2 == 0 && num != num1){
                cnt2 = 1;
                num2 = num;
            }
            else{
                cnt1 -- ;
                cnt2 -- ;
            }
        }
        cnt1 = 0 ;
        cnt2 = 0;
        for(int num : nums){
            if(num == num1) cnt1 ++;
            else if(num == num2) cnt2 ++;
        }
        
        List<Integer> result = new ArrayList<>();
        if(cnt1 > n / 3) result.add(num1);
        if(cnt2 > n / 3) result.add(num2);

        return result;
    }
}