public class Solution {
    public String countAndSay(int n) {
		if(n == 1) return "1";
		String last = countAndSay(n-1);
		StringBuffer sb = new StringBuffer();
		int c = 1;
		char pivot = last.charAt(0);
		for(int i = 1; i < last.length(); i++){
			if(last.charAt(i) != pivot){
				sb.append(c);
				sb.append(pivot);
				pivot = last.charAt(i);
				c = 1;
			}else c++;
		}
		sb.append(c);
		sb.append(pivot);
		return sb.toString();
        
    }
}
