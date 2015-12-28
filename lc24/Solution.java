public class Solution {
    public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode res = head.next;
		head.next = swapPairs(res.next);
		res.next = head;
		return res;
        
    }
}
