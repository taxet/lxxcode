/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0) {
        return false;
    }
    if (x === 0) {
        return true;
    }
    if (x % 10 === 0) {
        return false;
    }
    var d = 0;
    while (d <= x) {
        if (d === x) {
            return true;
        }
        d = d * 10 + x % 10;
        if (d === x) {
            return true;
        }
        x = Math.floor(x / 10);
    }
    return false;
};
