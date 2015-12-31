public class Solution {
    public int firstMissingPositive(int[] nums) {
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == i+1) continue;
			if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
				int tmp = nums[i];
				nums[i] = nums[nums[i] - 1];
				nums[tmp - 1] = tmp;
				i--;
			}
		}
		for(int i = 0; i< nums.length; i++){
			if(nums[i] != i+1) return i+1;
		}
		return nums.length + 1;
        
    }
}
