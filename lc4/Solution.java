public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int l = nums1.length + nums2.length;
			if (l % 2 == 0) {
				int m1 = findMedianSortedArrays(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, l / 2);
				int m2 = findMedianSortedArrays(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, l / 2 - 1);
				return 0.5 * (m1 + m2);
			} else {
				return (double)findMedianSortedArrays(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, l / 2);
			}
		}
		
		private static int findMedianSortedArrays(int[] nums1, int s1, int e1, int[] nums2, int s2, int e2, int k){
			int l1 = e1 - s1 + 1;
			int l2 = e2 - s2 + 1;
			
			if (l1 == 0) {
				return nums2[s2 + k];
			}
			if (l2 == 0) {
				return nums1[s1 + k];
			}
			if (k == 0) {
				return Math.min(nums1[s1], nums2[s2]);
			}
			
			int p1 = l1 * k / (l1 + l2);
			int p2 = k - p1 - 1;
			
			int m1 = s1 + p1;
			int m2 = s2 + p2;
			
			if (nums1[m1] < nums2[m2]) {
				k -= p1 + 1;
				e2 = m2;
				s1 = m1 + 1;
			} else {
				k -= p2 + 1;
				e1 = m1;
				s2 = m2 + 1;
			}
			return findMedianSortedArrays(nums1, s1, e1, nums2, s2, e2, k);
		}
    
}
