public class Solution {
    public int removeDuplicates(int[] A) {
		if(A == null || A.length == 0) return 0;
		int curr = 1;
		for(int next = 1; next < A.length; next++){
			if(A[next-1] != A[next]){
				A[curr] = A[next];
				curr++;
			}
		}
		return curr;
        
    }
}
