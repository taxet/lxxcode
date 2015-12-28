public class Solution {
    public int longestValidParentheses(String s) {
		if(s == null || s.length() == 0) return 0;
		int[] dp = new int[s.length()];
		int res = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '(') dp[i] = 0;
			else {
				if(i == 0) continue;
				if(s.charAt(i-1) == '(') {
					dp[i] = 2;
					if(i>1) dp[i] += dp[i-2];
				}else{
					int ti = i - dp[i-1] - 1;
					if(ti < 0) dp[i] = 0;
					else if(s.charAt(ti) == '(') {
						dp[i] = dp[i-1] + 2;
						if(ti>0) dp[i] += dp[ti - 1];
					}
					else dp[i] = 0;
				}
				res = res>dp[i]?res:dp[i];
			}
		}
		return res;
        
    }
}
