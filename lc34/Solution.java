public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                end = mid;
            } else {
                end = mid - 1;
            }
        }
        if (nums[start] != target) {
            return res;
        }
        res[0] = start;
        start = 0;
        end = nums.length - 1;
        while(start < end) {
            int mid = (start + end) / 2 + 1;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        res[1] = start;
        return res;
    }
}
