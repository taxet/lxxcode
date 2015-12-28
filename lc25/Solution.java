public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
		if(head == null) return head;
		int i = 1;
		ListNode next = head.next;
		while(next != null){
			if(i == k) break;
			i++;
			next = next.next;
		}
		if(i < k) return head;
		ListNode tmp = reverseKGroup(next, k);
		i = 1;
		ListNode prev = head;
		next = head.next;
		while(i < k){
			ListNode nn = next.next;
			next.next = prev;
			prev = next;
			next = nn;
			i++;
		}
		head.next = tmp;
		return prev;
        
    }
}
