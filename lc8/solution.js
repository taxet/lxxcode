/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    var i = 0;
    var res = 0;
    while (i < str.length && str[i] === ' ') {
        i++;
    }
    var positive = true;
    if (str[i] === '-') {
        positive = false;
        i++;
    } else if (str[i] === '+') {
        i++;
    }
    for (; i < str.length; i++) {
        if (str[i] < '0' || str[i] > '9') {
            break;
        }
        var t = str[i] - '0';
        res *= 10;
        res += t;
        if (positive && res > Math.pow(2, 31) - 1) {
            return Math.pow(2, 31) - 1;
        } else if (!positive && res > Math.pow(2, 31)){
            return -Math.pow(2, 31);
        }
    }
    return positive?res:-res;
};
