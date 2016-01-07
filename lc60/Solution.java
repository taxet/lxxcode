public class Solution {
    public String getPermutation(int n, int k) {
		k--;
		int fact = 1;
		for(int i = 0; i < n; i++)
			fact *= (n-i);
		StringBuffer cache = new StringBuffer("123456789").delete(n, 9);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			fact /= n-i;
			int d = k / fact;
			sb.append(cache.charAt(d));
			cache.deleteCharAt(d);
			k %= fact;
		}
		return sb.toString();
        
    }
}
