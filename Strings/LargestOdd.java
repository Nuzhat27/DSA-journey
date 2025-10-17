//Largest Odd Number in a String
/*Given a string s, representing a large integer, the task is to return the largest-valued odd integer
 (as a string) that is a substring of the given string s.
The number returned should not have leading zero's.
 But the given input string may have leading zero.
 (If no odd number is found, then return empty string.)*/
 
class LargestOdd{
	public String largeOddNum(String s){
		int n = s.length();
		int endIndex = -1, startIndex = 0;
		for(int i = n - 1 ; i >= 0 ; i --){
			if(s.charAt(i) % 2 != 0){
				endIndex = i;
				break;
			}
		}
		if(endIndex == -1) return "";
		for(int i = 0 ; i < n ; i ++){
			if(s.charAt(i) != '0'){
				startIndex = i;
				break;
			}
		}
		return s.substring(startIndex , endIndex + 1);
	}
}