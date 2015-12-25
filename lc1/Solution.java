public class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length; i++){
			hashMap.put(target - nums[i], i);
		}
		int[] res = new int[2];
		// Consider num[i] = target/2
		for(int i = 0; i < nums.length; i++){
			if(hashMap.containsKey(nums[i])){
				res[0] = i + 1;
				res[1] = hashMap.get(nums[i]) + 1;
				if(res[0] != res[1])
					break;
			}
		}
		return res;
    }
}
