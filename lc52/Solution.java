public class Solution {
    public int totalNQueens(int n) {
		int[] res = {0};
		int[] state = new int[n];
		totalNQueens(res, n, 0, state);
		return res[0];
        
    }
	public void totalNQueens(int[] res, int n, int layer, int[] state){
		if(layer == n) res[0]++;
		else{
			for(int i = 0; i < n; i++){
				boolean flag = false;
				for(int j = 0; j < layer; j++){
					if(i == state[j] || Math.abs(i - state[j]) == layer - j){
						flag = true;
						break;
					}
				}
				if(flag) continue;
				state[layer] = i;
				totalNQueens(res, n, layer + 1, state);
			}
		}
	}
}
