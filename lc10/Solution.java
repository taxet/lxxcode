public class Solution {
    public boolean isMatch(String s, String p) {
		if(p == null) return s == null;
		if(p.length() == 0) return s.length() == 0;
		return isMatch(s.toCharArray(), p.toCharArray(), 0, 0);
        
    }
	public boolean isMatch(char[] s, char[] p, int ss, int ps){
		if(ps == p.length) return ss == s.length;
		if(ps + 1 < p.length && p[ps+1] == '*'){
			if(ss == s.length) return isMatch(s, p, ss, ps+2);
			if(p[ps]=='.'){ 
				for(int i = ss; i <= s.length; i++){
					if(isMatch(s, p, i, ps+2))
						return true;
				}
			}else{
				int i = ss;
				while(i < s.length && s[i] == p[ps]){
					if(isMatch(s, p, i, ps+2)) return true;
					i++;
				}
				return isMatch(s, p, i, ps+2);
			}
		}else{
			if(ss == s.length) return false; 
			return (s[ss] == p[ps] || p[ps] == '.') && isMatch(s, p, ss+1, ps+1);
		}
		return false;
	}
}
