/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    var positive = true;
    if (x < 0) {
        positive = false;
        x = -x;
    }
    var res = 0;
    while (x > 0) {
        res *= 10;
        res += x % 10;
        x = Math.floor(x / 10);
    }
    if (!positive) {
        if (res > Math.pow(2, 31)) {
            return 0;
        }
        res = - res;
    }
    if (res > Math.pow(2, 31) - 1) {
        return 0;
    }
    return res;
};
