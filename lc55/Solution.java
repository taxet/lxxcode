public class Solution {
    public boolean canJump(int[] nums) {
		int farest = 0;
		for(int i = 0; i < nums.length; i++){
			if(i > farest) return false;
			farest = Math.max(farest, i + nums[i]);
			if(farest >= nums.length - 1) return true; 
		}
		return false;
        
    }
}
