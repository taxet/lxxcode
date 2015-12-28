public class Solution {
    public int divide(int dividend, int divisor) {
		long longDen = dividend;
		long longDsr = divisor;
		longDen = longDen>0?longDen:-longDen;
		longDsr = longDsr>0?longDsr:-longDsr;
		long lim = longDsr;
		boolean neg = dividend < 0 ^ divisor < 0;
		long quotient = 0;
		while(longDsr < longDen) longDsr <<= 1;
		while(longDsr >= lim){
			quotient <<= 1;
			if(longDen >= longDsr){
				quotient += 1;
				longDen -= longDsr;
			}
			longDsr >>= 1;
		}
		int res = 0;
		if(neg){
			quotient = -quotient;
			if(quotient < Integer.MIN_VALUE) res = Integer.MIN_VALUE;
			else res = (int)quotient;
		}else{
			if(quotient > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
			else res = (int)quotient;
		}
		return res;
        
    }
}
