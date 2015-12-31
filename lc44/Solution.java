public class Solution {
    public boolean isMatch(String s, String p) {
		if(s == null) s = "";
		if(p == null) p = "";
		if(p.length() == 0) return s.length() == 0;
		int start = -1;
		int ss = 0;
		int sss = ss;
		int ps = 0;
		while(ss < s.length()){
			if(ps < p.length() && (p.charAt(ps) == '?' || p.charAt(ps) == s.charAt(ss))){
				ss++;
				ps++;
			} else if(ps < p.length() && p.charAt(ps) == '*'){
				start = ps++;
				sss = ss;
			}else if(start != -1){
				ps = start + 1;
				ss = ++ sss;
			}else return false;
		}
		while(ps < p.length() && p.charAt(ps) == '*') ps++;
		return ps == p.length();
    }
}
