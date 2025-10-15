//Palindrome check
class PalindromeCheck{
	public boolean PalindromeCheck(String s ){
		int left = 0 , right = s.size() - 1;
		while(left < right){
			if(s.charAt(left) != s.charAt(right)) return false;
		}
		return true;
	}
}