public class Solution {
    public List<String> letterCombinations(String digits) {
		List<String> res = new LinkedList<String>();
		if(digits == null || digits.length() == 0) return res;
		List<String> last = letterCombinations(digits.substring(1));
		char[] ca = new char[0];
		switch(digits.charAt(0)){
		case '2':
			ca = new char[3];
			ca[0] = 'a';
			ca[1] = 'b';
			ca[2] = 'c';
			break;
		case '3':
			ca = new char[3];
			ca[0] = 'd';
			ca[1] = 'e';
			ca[2] = 'f';
			break;
		case '4':
			ca = new char[3];
			ca[0] = 'g';
			ca[1] = 'h';
			ca[2] = 'i';
			break;
		case '5':
			ca = new char[3];
			ca[0] = 'j';
			ca[1] = 'k';
			ca[2] = 'l';
			break;
		case '6':
			ca = new char[3];
			ca[0] = 'm';
			ca[1] = 'n';
			ca[2] = 'o';
			break;
		case '7':
			ca = new char[4];
			ca[0] = 'p';
			ca[1] = 'q';
			ca[2] = 'r';
			ca[3] = 's';
			break;
		case '8':
			ca = new char[3];
			ca[0] = 't';
			ca[1] = 'u';
			ca[2] = 'v';
			break;
		case '9':
			ca = new char[4];
			ca[0] = 'w';
			ca[1] = 'x';
			ca[2] = 'y';
			ca[3] = 'z';
			break;
		case '0':
			ca = new char[1];
			ca[0] = ' ';
			break;
		default: break;
		}
		for(int i = 0; i < ca.length; i++){
			if(last.size() == 0) res.add("" + ca[i]);
			else for(int j = 0; j < last.size(); j++){
				res.add(ca[i] + last.get(j));
			}
		}
		
		return res;
        
    }
}
