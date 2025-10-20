/*Sort Characters by Frequency
You are given a string s. Return the array of unique characters,
 sorted by highest to lowest occurring characters.
If two or more characters have same frequency then arrange them in alphabetic order.
*/

class Pair{
	int freq ;
	char ch;
	Pair(int freq , char ch){
		this.freq = freq;
		this.ch = ch;
	}
}
class SortByFrequency{
	public List<Character> frequencySort(String s){
		Pair[] freq = new Pair[26];
		for(int i = 0 ; i < 26 ; i ++){
			freq[i] = new Pair(0 , (char)(i + 'a'));
		}
		for(char ch : s.toCharArray()){
			freq[ch - 'a'].freq ++;
		}
		Arrays.sort(freq , (p1 , p2) ->{
			if(p1.freq != p2.freq)return p2.freq - p1.freq ;
			return p1.ch - p2.ch;
		});
		List<Character> ans = new ArrayList<>();
		for(Pair p : freq){
			if(p.freq > 0) ans.add(p.ch);
		}
		return ans;
	}
}