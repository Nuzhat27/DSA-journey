//Reverse a string
class ReverseString{
	public ArrayList<Character> reverseString(ArrayList<Character> s ){
		reverse(s , 0 , s.size() - 1);
		return s;
	}
	private void reverse(ArrayList<Character> s , int left , int right){
		if(left >= right) return;
		char temp = s.get(left);
		s.set(left , s.get(right));
		s.set(right , temp);
		reverse(s , left + 1 , right - 1);
	}
	
}