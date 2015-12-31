public class Solution {
    public int jump(int[] nums) {
		int step = 0;
		int farest = 0;
		int t = 0;
		for(int i = 0; i < nums.length; i++){
			if(i > t){
				step++;
				t = farest;
			}
			farest = Math.max(farest, i + nums[i]);
		}
		return step;
    }
}
