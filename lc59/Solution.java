public class Solution {
    public int[][] generateMatrix(int n) {
		int t = 1;
		int[][] matrix = new int[n][n];
		int layers = (n + 1) / 2;
		for(int i = 0; i < layers; i++){
			if(n - i == i + 1) {
				matrix[i][i] = t++;
				return matrix;
			}
			for(int j = i; j < n-i-1; j++)
				matrix[i][j] = t++;
			for(int j = i; j < n-i-1; j++)
				matrix[j][n-i-1] = t++;
			for(int j = n-i-1; j>i; j--)
				matrix[n-i-1][j] = t++;
			for(int j = n-i-1; j>i; j--)
				matrix[j][i] = t++;
		}
		return matrix;
        
    }
}
