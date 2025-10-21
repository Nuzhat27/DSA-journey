//Sum of first N numbers
class SumOfN{
	public int NnumbersSum(int num){
		if(num == 0) return 0;
		return num + NnumbersSum(num - 1);
	}
}