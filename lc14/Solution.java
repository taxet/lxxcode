public class Solution {
    public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0 || strs[0] == null || strs[0].length() == 0) return "";
		StringBuffer res = new StringBuffer();
		char c;
		for(int i = 0; i < strs[0].length(); i++){
			c = strs[0].charAt(i);
			boolean flag = true;
			for(int j = 1; j < strs.length; j++){
				if(i >= strs[j].length() || strs[j].charAt(i) != c){
					flag = false;
					break;
				}
			}
			if(!flag) break;
			res.append(c);
		}
		return res.toString();
        
    }
}
