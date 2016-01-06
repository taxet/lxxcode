/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    var l = nums1.length + nums2.length;
    if (l % 2 === 0) {
        var m1 = getK(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, l / 2);
        var m2 = getK(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, l / 2 - 1);
        return (m1 + m2) / 2;
    } else {
        return getK(nums1, nums2, 0, nums1.length - 1, 0, nums2.length - 1, Math.floor(l / 2));
    }
};

var getK = function(nums1, nums2, s1, e1, s2, e2, k) {
    var l1 = e1 - s1 + 1;
    var l2 = e2 - s2 + 1;
    if (l1 === 0) {
        return nums2[s2 + k];
    }
    if (l2 === 0) {
        return nums1[s1 + k];
    }
    if (k === 0) {
        return Math.min(nums1[s1], nums2[s2]);
    }
    var p1 = Math.floor(l1 * k / (l1 + l2));
    var p2 = k - p1 - 1;
    
    var m1 = s1 + p1;
    var m2 = s2 + p2;
    
    if (nums1[m1] < nums2[m2]) {
        k -= p1 + 1;
        e2 = m2;
        s1 = m1 + 1;
    } else {
        k -= p2 + 1;
        e1 = m1;
        s2 = m2 + 1;
    }
    return getK(nums1, nums2, s1, e1, s2, e2, k);
};
