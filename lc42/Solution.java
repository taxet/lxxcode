public class Solution {
    /**
     * @param heights: an array of integers
     * @return: a integer
     */
    public int trap(int[] heights) {
        if (null == heights || 0 == heights.length) {
            return 0;
        }
        if (heights.length <= 2) {
            return 0;
        }
        int start = 0; int end = heights.length - 1;
        int leftMaxIdx = 0;
        int rightMaxIdx = heights.length - 1;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[leftMaxIdx]) {
                leftMaxIdx = i;
            }
        }
        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > heights[rightMaxIdx]) {
                rightMaxIdx = i;
            }
        }
        int area = heights[leftMaxIdx] * (rightMaxIdx - leftMaxIdx + 1);
        if (leftMaxIdx != 0) {
            area += heights[0];
        }
        if (rightMaxIdx != heights.length - 1) {
            area += heights[heights.length - 1];
        }
        int tmp = heights[0];
        for (int i = 1; i < leftMaxIdx; i++) {
            if (heights[i] > tmp) {
                tmp = heights[i];
            }
            area += tmp;
        }
        tmp = heights[heights.length - 1];
        for (int i = heights.length - 2; i > rightMaxIdx; i--) {
            if (heights[i] > tmp) {
                tmp = heights[i];
            }
            area += tmp;
        }
        for (int i = 0; i < heights.length; i++) {
            area -= heights[i];
        }
        return area;
    }
}
