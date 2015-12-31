public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> oneRes = new ArrayList<Integer>();
		permuteUnique(res, oneRes, nums, 0);
		return res;
        
    }
	public void permuteUnique(List<List<Integer>> res, List<Integer> oneRes, int[] nums, int index){
		if(index == nums.length) {
			res.add(new ArrayList<Integer>(oneRes));
			return;
		}
		for(int i = index; i < nums.length; i++){
			boolean flag = true;
			for(int j = index; j < i; j++){
				if(nums[j] == nums[i]){
					flag = false;
					break;
				}
			}
			if(flag){
				int tmp = nums[i];
				nums[i] = nums[index];
				nums[index] = tmp;
				oneRes.add(nums[index]);
				permuteUnique(res, oneRes, nums, index + 1);
				oneRes.remove(oneRes.size() - 1);
				tmp = nums[i];
				nums[i] = nums[index];
				nums[index] = tmp;
			}
		}
	}
}
