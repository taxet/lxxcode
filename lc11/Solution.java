public class Solution {
    public int maxArea(int[] height) {
		int s = 0;
		int e = height.length - 1;
		int area = Math.min(height[s], height[e]) * (e - s);
		while(e > s && s < height.length - 1 && e >0){
			if(height[s] > height[e]) e--;
			else s++;
			int newArea = Math.min(height[s], height[e]) * (e - s);
			area = area>newArea?area:newArea;
		}
		return area;
        
    }
}
