public class Solution {
    public boolean isPalindrome(int x) {
		if(x < 0) return false;
		if(x%10 == 0 && x > 0) return false;
        int b = 0;
        while(x >= b){
            if(b == x) return true;
            b = b * 10 + x % 10;
            if(b == x) return true;
            x /= 10;
        }
        return false;
    }
}
