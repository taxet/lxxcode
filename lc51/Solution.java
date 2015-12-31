public class Solution {
    public List<String[]> solveNQueens(int n) {
		List<String[]> res = new ArrayList<String[]>();
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++){
			Arrays.fill(board[i], '.');
		}
		int[] state = new int[n];
		Arrays.fill(state, -1);
		solveNQueens(res, board, 0, n, state);
		return res;
        
    }
	public void solveNQueens(List<String[]> res, char[][] board, int layer, int n, int[] state){
		if(layer == n){
			String[] oneRes = new String[n];
			for(int i = 0; i < n; i++){
				oneRes[i] = new String(board[i]);
			}
			res.add(oneRes);
		}
		else{
			for(int i = 0; i < n; i++){
				boolean flag = false;
				for(int j = 0; j < layer; j++){
					if((state[j] == i) || ((layer - j) == Math.abs(i - state[j]))) {
						flag = true;
						break;
					}
				}
				if(flag) continue;
				state[layer] = i;
				board[layer][i] = 'Q';
				solveNQueens(res, board, layer+1, n, state);
				state[layer] = -1;
				board[layer][i] = '.';
			}
		}
	}
}
