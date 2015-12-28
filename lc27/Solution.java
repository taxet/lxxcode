public class Solution {
    public int removeElement(int[] A, int elem) {
		int curr = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] != elem){
				A[curr] = A[i];
				curr++;
			}
		}
		return curr;
        
    }
}
