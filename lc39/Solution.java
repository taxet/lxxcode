public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		List<Integer> oneRes = new LinkedList<Integer>();
		Arrays.sort(candidates);
		combitionSum(res, oneRes, candidates, target, 0);
		return res;		
        
    }
	public void combitionSum(List<List<Integer>> res, List<Integer> oneRes, int[] candidates, int target, int start){
		if(target < 0) return;
		if(target == 0){
			res.add(new LinkedList<Integer>(oneRes));
			return;
		}
		for(int i = start; i < candidates.length; i++){
			oneRes.add(candidates[i]);
			combitionSum(res, oneRes, candidates, target - candidates[i], i);
			oneRes.remove(oneRes.size() - 1);
		}
	}
}
