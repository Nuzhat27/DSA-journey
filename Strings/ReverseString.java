//Reverse a String II
class ReverseString{
	public void reverseString(List<Character> s){
		int left = 0 , right = s.size() - 1 ;
		while(left < right){
			char ch = s.get(s.get(left));
			s.set(left , s.get(right));
			s.set(right , ch);
			left += 1;
			right -= 1;
		}
	}
}