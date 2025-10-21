//Factorial of a given number
class Factorial{
	public long calFac(int num){
		if(num == 0)return 1;
		return num * calFac(num - 1);
	}
}