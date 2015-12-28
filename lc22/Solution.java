public class Solution {
    public List<String> generateParenthesis(int n) {
		return bFS(n, n);
        
    }
	public List<String> bFS(int l, int r){
		List<String> res = new LinkedList<String>();
		if(r == 0 || l > r) return res;
		if(l == 0){
			char[] ca = new char[r];
			for(int i = 0; i < r; i++)
				ca[i] = ')';
			res.add(new String(ca));
		}else{
			List<String> l1 = bFS(l-1, r);
			for(int i = 0; i < l1.size(); i++){
				res.add("(" + l1.get(i));
			}
			if(l < r){
				List<String> l2 = bFS(l, r-1);
				for(int i = 0; i < l2.size(); i++){
					res.add(")" + l2.get(i));
				}
			}
		}
		return res;
	}
}
