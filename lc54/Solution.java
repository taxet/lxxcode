public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new LinkedList<Integer>();
		int m = matrix.length;
		if(m == 0) return res;
		int n = matrix[0].length;
		int layers = (Math.min(m, n) + 1)/2;
		for(int i = 0; i < layers; i++){
			if(n - 2 * i == 1){
				for(int j = i; j < m - i; j++){
					res.add(matrix[j][i]);
				}
				break;
			}
			if(m - 2 * i == 1){
				for(int j = i; j < n - i; j++){
					res.add(matrix[i][j]);
				}
				break;
			}
			for(int j = i; j < n - i - 1; j++)
				res.add(matrix[i][j]);
			for(int j = i; j < m - i - 1; j++)
				res.add(matrix[j][n-i-1]);
			for(int j = n-i-1 ; j >i ; j--)
				res.add(matrix[m-i-1][j]);
			for(int j = m-i-1; j >i ; j--)
				res.add(matrix[j][i]);
		}
		return res;
        
    }
}
