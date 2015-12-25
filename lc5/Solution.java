public class Solution {
    public String longestPalindrome(String s) {
		int length = 0;
		int start = 0;
		char[] charArray = s.toCharArray();
		for(int i = 0; i < s.length(); i++){
			int d = palindromeCheck(charArray, i, i);
			if(d > length){
				length = d;
				start = i - d/2;
			}
		}
		for(int i = 0; i < s.length() - 1; i ++){
			if(charArray[i] == charArray[i+1]){
				int d = palindromeCheck(charArray, i, i+1);
				if(d > length){
					length = d;
					start = i - d/2 + 1;
				}
			}
		}
		return s.substring(start, start+length);
        
    }
	public int palindromeCheck(char[] charArray, int start, int end){
		while(start > 0 && end < charArray.length - 1 && charArray[start-1] == charArray[end+1]){
			start--;
			end++;
		}
		return end - start + 1;
	}
}
