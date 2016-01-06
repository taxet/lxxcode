/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    var res = new ListNode(0);
    var curr = res;
    var carry = 0;
    var d = 0;
    while (l1 !== null && l2 !== null) {
        d = l1.val + l2.val + carry;
        carry = Math.floor(d / 10);
        d = d % 10;
        curr.next = new ListNode(d);
        l1 = l1.next;
        l2 = l2.next;
        curr = curr.next;
    }
    while (l1 !== null) {
        d = l1.val + carry;
        carry = Math.floor(d / 10);
        d = d % 10;
        curr.next = new ListNode(d);
        l1 = l1.next;
        curr = curr.next;
    }
    while (l2 !== null) {
        d = l2.val + carry;
        carry = Math.floor(d / 10);
        d = d % 10;
        curr.next = new ListNode(d);
        l2 = l2.next;
        curr = curr.next;
    }
    if (carry !== 0) {
        curr.next = new ListNode(carry);
    }
    if (res.next === null) {
        res.next = new ListNode(0);
    }
    return res.next;
};
