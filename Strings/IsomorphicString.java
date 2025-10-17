//Isomorphic String
class IsomorphicString{
	public boolean checkIsomorphic(String s , String t){
		if(s.length() != t.length()) return false;
		Map<Character , Character> mpp = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i ++){
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if(mpp.containsKey(c1)){
				if(mpp.get(c1) != c2) return false;
			}
			else if(mpp.containsValue(c2)) return false;
			mpp.put(c1 , c2);
		}
		return true;
	}
}