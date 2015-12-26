public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
		//method 1: based on 3sum
		Arrays.sort(num);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i =0; i < num.length - 3; i++){
			if(i > 0 && num[i] == num[i-1]) continue;
			List<List<Integer>> last = threeSum(num, i+1, target - num[i]);
			if(last.size() >0 ){
				for(int j = 0; j < last.size(); j++){
					List<Integer> oneRes = new ArrayList<Integer>();
					oneRes.add(num[i]);
					oneRes.add(last.get(j).get(0));
					oneRes.add(last.get(j).get(1));
					oneRes.add(last.get(j).get(2));
					res.add(oneRes);
				}
			}
		}
		return res;
        
    }
	public List<List<Integer>> threeSum(int[] num, int s, int target){
		//Arrays.sort(num);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i = s; i < num.length - 2; i++){
			if(i > s && num[i] == num[i-1]) continue;
			int rest = target - num[i];
			int start = i + 1;
			int end = num.length - 1;
			while(end > start){
				if(num[end] + num[start] == rest){
					ArrayList<Integer> oneRes = new ArrayList<Integer>();
					oneRes.add(num[i]);
					oneRes.add(num[start]);
					oneRes.add(num[end]);
					res.add(oneRes);
					while(end > start && num[start] == num[start + 1])
						start++;
					while(end > start && num[end] == num[end - 1])
						end--;
					start++;
					end--;
				}
				else if(num[end] + num[start] < rest) {
					while(end > start && num[start] == num[start + 1])
						start++;
					start ++;
				}
				else  {
					while(end > start && num[end] == num[end - 1])
						end--;
					end--;
				}
			}
		}
		
		return res;
	}
}
