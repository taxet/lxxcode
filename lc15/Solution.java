public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i = 0; i < num.length - 2; i++){
			if(i > 0 && num[i] == num[i-1]) continue;
			int rest = 0 - num[i];
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
