public class Solution {
    public String intToRoman(int num) {
		int d3 = num / 1000;
		int d2 = num % 1000 / 100;
		int d1 = num % 100 / 10;
		int d0 = num % 10;
		StringBuffer res = new StringBuffer();
		for(int i = 0; i < d3; i++){
			res.append("M");
		}
		if(d2 == 9) res.append("CM");
		else if(d2 == 4) res.append("CD");
		else {
			if(d2 >= 5) {
				res.append("D");
				d2 -= 5;
			}
			for(int i = 0; i < d2; i++){
				res.append("C");
			}
		}
		
		if(d1 == 9) res.append("XC");
		else if(d1 == 4) res.append("XL");
		else {
			if(d1 >= 5) {
				res.append("L");
				d1 -= 5;
			}
			for(int i = 0; i < d1; i++){
				res.append("X");
			}
		}
		
		if(d0 == 9) res.append("IX");
		else if(d0 == 4) res.append("IV");
		else {
			if(d0 >= 5) {
				res.append("V");
				d0 -= 5;
			}
			for(int i = 0; i < d0; i++){
				res.append("I");
			}
		}
		return res.toString();
        
    }
}
