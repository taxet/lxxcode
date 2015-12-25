public class Solution {
    public String convert(String s, int numRows) {
		if(s == null || s.length() == 0) return s;
		if(numRows == 1) return s;
		List<List<Character>> arrs = new LinkedList<List<Character>>();
		for(int i = 0; i < numRows; i++){
			arrs.add(new LinkedList<Character>());
		}
		char[] charArray = s.toCharArray();
		int g = numRows * 2 - 2;
		for(int i = 0; i < s.length(); i++){
			int dir = i%g;
			if(dir >= numRows) dir = g - dir;
			arrs.get(dir).add(charArray[i]);
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < arrs.size(); i++){
			List<Character> l = arrs.get(i);
			for(int j = 0; j < l.size(); j++){
				sb.append(l.get(j));
			}
		}
		return sb.toString();
        
    }
}
