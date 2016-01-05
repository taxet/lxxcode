public class Solution {
    public int maxSubArray(int[] nums) {
		int res = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++){
			res = Math.max(res, nums[i]);
		}
		int tmp = 0;
		for(int i = 0; i < nums.length; i++){
			tmp += nums[i];
			if(tmp > 0) res = Math.max(res, tmp);
			else tmp = 0;
		}
		return res;
        
    }
}
