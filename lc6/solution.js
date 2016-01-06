/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows <= 1) {
        return s;
    }
    var arr = new Array(numRows);
    for (var i = 0; i < numRows; i++) {
        arr[i] = [];
    }
    i = 0;
    var a = true;
    for (var j = 0; j < s.length; j++) {
        arr[i].push(s[j]);
        if (i === 0) {
            a = true;
            i++;
        } else if(i === numRows - 1) {
            a = false;
            i--;
        } else if (a) {
            i++;
        } else {
            i--;
        }
    }
    var res = "";
    arr.forEach(function(ele) {
        res += ele.join("");
    });
    return res;
};
