public class Solution {
    public void nextPermutation(int[] num) {
		int i = num.length - 1;
		while(i > 0 && num[i-1] >= num[i]){
			i--;
		}
		if(i == 0){
			Arrays.sort(num);
			return;
		}
		int tmp = num[i - 1];
		int[] tmpnum = new int[num.length - i];
		tmpnum[tmpnum.length - 1] = num[i - 1];
		for(int j = 0; j < tmpnum.length; j++){
			tmpnum[j] = num[i + j];
		}
		for(int j = tmpnum.length - 1; j >= 0; j--){
			if(tmpnum[j] > tmp){
				tmp = tmpnum[j];
				tmpnum[j] = num[i - 1];
				break;
			}
		}
		Arrays.sort(tmpnum);
		for(int j = i; j < num.length; j++){
			num[j] = tmpnum[j-i];
		}
		num[i-1] = tmp;
        
    }
}
