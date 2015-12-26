public class Solution {
    public boolean isValid(String s) {
		if(s == null || s.length() == 0) return true; 
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{')
				stack.push(c);
			else if(stack.empty()) return false;
			if(c == ')'){
				if(stack.pop() == '(') continue;
				else return false;
			}
			if(c == ']'){
				if(stack.pop() == '[') continue;
				else return false;
			}
			if(c == '}'){
				if(stack.pop() == '{') continue;
				else return false;
			}
		}
		return stack.empty();
        
    }
}
