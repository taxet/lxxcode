/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    var t = 0;
    var ss = {};
    for (var c in s) {
        ss[c] = 0;
    }
    ss[s[t]] = 1;
    var res = 0;
    for (var e = 1; e < s.length; e++) {
        while (ss[s[e]] === 1) {
            if (e - t > res) {
                res = e - t;
            }
            ss[s[t]] -= 1;
            t++;
        }
        ss[s[e]] = 1;
    }
    if (s.length - t > res) {
        res = s.length - t;
    }
    return res;
}; 
