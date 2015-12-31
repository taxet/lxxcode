public class Solution {
    public List<String> anagrams(String[] strs) {
		List<String> res = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < strs.length; i++){
			char[] chars = strs[i].toCharArray();
			Arrays.sort(chars);
			String s = new String(chars);
			if(map.containsKey(s)){
				if(map.get(s) != -1){
					res.add(strs[map.get(s)]);
					map.put(s, -1);
				}
				res.add(strs[i]);
			}else map.put(s, i);
		}
		return res;
    }
}
