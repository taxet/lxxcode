public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		List<Integer> oneRes = new LinkedList<Integer>();
		Arrays.sort(candidates);
		combitionSum2(res, oneRes, candidates, target, 0);
		return new LinkedList<List<Integer>>(res);
    }
	public void combitionSum2(Set<List<Integer>> res, List<Integer> oneRes, int[] candidates, int target, int start){
		if(target == 0){
			res.add(new LinkedList<Integer>(oneRes));
			return;
		}
		if(target < 0 || start == candidates.length) return;
		//if(start != 0 && candidates[start - 1] == candidates[start]) combitionSum2(res, oneRes, candidates, target, start + 1);
		else{
			oneRes.add(candidates[start]);
			combitionSum2(res, oneRes, candidates, target - candidates[start], start + 1);
			oneRes.remove(oneRes.size() - 1);
			combitionSum2(res, oneRes, candidates, target, start+1);
		}
	}
}
