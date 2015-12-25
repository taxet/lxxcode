public class Solution {
    public int lengthOfLongestSubstring(String s) {
		if(s == null || s.length() == 0) return 0;
		int res = -1;
		Set<Character> charSet = new HashSet<Character>();
		char[] charArray = s.toCharArray();
		int start = 0;
		charSet.add(charArray[0]);
		for(int i = 1; i < s.length(); i++){
			if(!charSet.contains(charArray[i])){
				charSet.add(charArray[i]);
				continue;
			}
			else{
				int gap = i - start;
				res = gap>res? gap: res;
				while(charSet.contains(charArray[i])){
					charSet.remove(charArray[start]);
					start++;
				}
				charSet.add(charArray[i]);
			}
		}
		int gap = s.length() - start;
		return res > gap ? res: gap;
    }
}
