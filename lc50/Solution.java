public class Solution {
    public double myPow(double x, int n) {
		if(n == 0) return 1;
		if(n == 1) return x;
		if(n < 0 && n != Integer.MIN_VALUE) return  1/myPow(x, -n);
		double t = myPow(x, n/2);
		if(n%2 == 0) return t * t;
		else return t * t * x;
    }
}
