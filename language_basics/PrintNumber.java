import java.util.*;
class PrintNumber{
	public static void printNumber(Scanner sc){
		int num = sc.nextInt();
		System.out.print(num);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		printNumber(sc);
	}
}