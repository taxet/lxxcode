public class Solution {
    public String multiply(String num1, String num2) {
		if(num1 == null) num1 = "";
		if(num2 == null) num2 = "";
		if(num1.length() == 0 || num2.length() == 0) return "0";
		int[] res = new int[num1.length() + num2.length()];
		num1 = new StringBuffer(num1).reverse().toString();
		num2 = new StringBuffer(num2).reverse().toString();
		for(int l1 = 0; l1 < num1.length(); l1++)
			for(int l2 = 0; l2 < num2.length(); l2++)
				res[l1 + l2] += (num1.charAt(l1) - '0') * (num2.charAt(l2) - '0');
		int carry = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < res.length; i++){
			sb.append((res[i] + carry) % 10);
			carry = (res[i] + carry) / 10;
		}
		sb.reverse();
		if(carry > 0) sb.insert(0, carry);
		String s = sb.toString();
		int i = 0;
		for(;i < s.length(); i++)
			if(s.charAt(i) != '0') break;
		s = s.substring(i);
        return s.length()==0?"0":s;
    }
}
