public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> res = new ArrayList<Integer>();
		if(s == null) return res;
		if(words.length < 1 || words[0].length() < 1) return res;
		if(s.length() < words.length * words[0].length()) return res;
		int len = words[0].length();
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		for(int i = 0; i < words.length; i++){
			if(wordMap.containsKey(words[i])){
				wordMap.put(words[i], wordMap.get(words[i])+1);
			}else wordMap.put(words[i], 1);
		}
		for(int i = 0; i < s.length() - words.length * len + 1; i++){
			String tmp = s.substring(i, i+len);
			if(wordMap.containsKey(tmp)){
				Map<String,Integer> count = new HashMap<String, Integer>();
				count.put(tmp, 1);
				boolean flag = true;
				for(int t = 1; t < words.length; t++){
					String tmp2 = s.substring(i+t*len, i+t*len+len);
					if(!wordMap.containsKey(tmp2)){
						flag = false;
						break;
					}
					if(count.containsKey(tmp2)){
						count.put(tmp2, count.get(tmp2) + 1);
						if(count.get(tmp2) > wordMap.get(tmp2)){
							flag = false;
							break;
						}
					}else count.put(tmp2, 1);
				}
				if(flag) res.add(i);
			}
		}
		return res;
        
    }
}
