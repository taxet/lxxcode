public class Solution {
    public boolean isValidSudoku(char[][] board) {
		int x = board.length;
		int y = board[0].length;
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				if(board[i][j] != '.'){
					for(int ii = 0; ii < x; ii++)
						if(ii != i && board[ii][j] == board[i][j]) return false;
					for(int jj = 0; jj < y; jj++)
						if(jj != j && board[i][jj] == board[i][j]) return false;
					for(int ii = i/3 * 3; ii < i/3 * 3 + 3; ii++){
						for(int jj = j/3 * 3; jj < j/3 * 3 + 3; jj++){
							if(ii != i && jj != j && board[ii][jj] == board[i][j]) return false;
						}
					}
				}
			}
		}
		return true;
        
    }
}
