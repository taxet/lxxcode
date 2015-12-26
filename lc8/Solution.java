public class Solution {
    public int reverse(int x) {
		if(x == Integer.MIN_VALUE) return 0;
		boolean nagetive = x<0;
		if(nagetive) x = -x;
		int res = 0;
		while(x != 0){
			if(res > Integer.MAX_VALUE/10) return 0;
			int d = x%10;
			x = x/10;
			if(res == Integer.MAX_VALUE/10){
				if((!nagetive) && d > 7) return 0;
				if(nagetive && d > 8) return 0;
			}
			res = 10 * res + d;
		}
		return nagetive?-res:res;
        
    }
}
