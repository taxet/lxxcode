public class Solution {
    public int strStr(String haystack, String needle) {
		if(haystack == null) return needle==null?0:-1;
		if(haystack.length() == 0) return needle.length()==0?0:-1;
		if(needle == null || needle.length() == 0) return 0;
		if(haystack.length() < needle.length()) return -1;
		for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
			if(haystack.charAt(i) == needle.charAt(0)){
				boolean flag = true;
				for(int j = 1; j < needle.length(); j++){
					if(haystack.charAt(i+j) != needle.charAt(j)){
						flag = false;
						break;
					}
				}
				if(flag) return i;
			}
		}
		return -1;
    }
}
