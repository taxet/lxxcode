public class Solution {
    public int romanToInt(String s) {
		int st = 0;
		int res = 0;
		if(s == null || s.length() == 0) return res;
		char[] ca = s.toCharArray();
		//1000
		while(st < s.length() && ca[st] == 'M'){
			res += 1000;
			st++;
		}
		//900, 400
		if(st < s.length() - 1 && ca[st] == 'C'){
			if(ca[st+1] == 'M') {
				res += 900;
				st += 2;
			}else if(ca[st+1] == 'D'){
				res += 400;
				st += 2;
			}
		}
		//100;
		if(st < s.length() && ca[st] == 'D'){
			res += 500;
			st++;
		}
		while(st < s.length() && ca[st] == 'C'){
			res += 100;
			st++;
		}
		//90, 40
		if(st < s.length() - 1 && ca[st] == 'X'){
			if(ca[st+1] == 'C') {
				res += 90;
				st += 2;
			}else if(ca[st+1] == 'L'){
				res += 40;
				st += 2;
			}
		}
		//10;
		if(st < s.length() && ca[st] == 'L'){
			res += 50;
			st++;
		}
		while(st < s.length() && ca[st] == 'X'){
			res += 10;
			st++;
		}
		//9, 4
		if(st < s.length() - 1 && ca[st] == 'I'){
			if(ca[st+1] == 'X') {
				res += 9;
				st += 2;
			}else if(ca[st+1] == 'V'){
				res += 4;
				st += 2;
			}
		}
		//1;
		if(st < s.length() && ca[st] == 'V'){
			res += 5;
			st++;
		}
		while(st < s.length() && ca[st] == 'I'){
			res += 1;
			st++;
		}
		return res;
        
    }
}
