/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var sumMap = {};
    for (var i = 0; i < nums.length; i++) {
        sumMap[target - nums[i]] = i;
    }
    for (i = 0; i < nums.length; i++) {
        if (sumMap.hasOwnProperty(nums[i]) && sumMap[nums[i]] != i) {
            return [i + 1, sumMap[nums[i]] + 1];
        }
    }
    return [];
};
