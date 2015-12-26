public class Solution {
    public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int res = target;
		int minAbs = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length - 2; i++){
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int start = i + 1;
			int end = nums.length - 1;
			while(end > start){
				int sum = nums[i] + nums[start] + nums[end];
				if(sum == target) return target;
				int abs = Math.abs(sum - target);
				if(abs < minAbs){
					res = sum;
					minAbs = abs;
				}
				if(sum < target){
					while(end > start && nums[start] == nums[start+1]) start++;
					start++;
				}
				else{
					while(end > start && nums[end] == nums[end-1]) end--;
					end--;
				}
			}
		}
		
		return res;
        
    }
}
