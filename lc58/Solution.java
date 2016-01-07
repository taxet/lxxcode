public class Solution {
    public int lengthOfLastWord(String s) {
		if(s == null || s.length() == 0) return 0;
		int index = s.length();
		while(index > 0 && s.charAt(index-1) == ' ') index--;
		if(index == 0) return 0;
		String[] ss = s.split(" ");
		return ss[ss.length - 1].length();
        
    }
}
