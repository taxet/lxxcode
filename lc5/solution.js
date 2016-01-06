/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    var res = "";
    for (var i = 0; i < s.length; i++) {
        var tmp = getPalindrome(s, i, i);
        if (tmp.length > res.length) {
            res = tmp;
        }
    }
    for (i = 1; i < s.length; i++) {
        tmp = getPalindrome(s, i - 1, i); 
        if (tmp.length > res.length) {
            res = tmp;
        }
    }
    return res;
};

var getPalindrome = function(s, mid1, mid2) {
    while (mid1 >= 0 && mid2 < s.length && s[mid1] === s[mid2]) {
        mid1--;
        mid2++;
    }
    mid1++;
    mid2--;
    if (mid1 > mid2) {
        return "";
    }
    return s.substring(mid1, mid2 + 1);
};
