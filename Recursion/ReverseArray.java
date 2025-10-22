//Reverse an array
class ReverseArray{
	public int[] reverseArray(int[] num){
		reverse(num , 0 , num.length - 1);
		return num;
	}
	private void reverse(int[] num , int left , int right){
		if(left >= right)return;
		int temp = num[left];
		num[left] = num[right];
		num[right] = temp;
		reverse(num , left + 1 , right - 1);
	}
}