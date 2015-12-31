public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums, nums.length - 1);
    }
	public List<List<Integer>> permute(int[] nums, int end){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(end < 0) return res;
		if(end == 0){
			List<Integer> oneRes = new ArrayList<Integer>();
			oneRes.add(nums[end]);
			res.add(oneRes);
		}else{
			List<List<Integer>> last = permute(nums, end-1);
			for(int i = 0; i < last.size(); i++){
				List<Integer> l = last.get(i);
				for(int j = 0; j <= l.size(); j++){
					l.add(j, nums[end]);
					res.add(new ArrayList<Integer>(l));
					l.remove(j);
				}
			}
		}
		return res;
	}
}
