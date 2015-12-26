public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode n1 = pre;
		ListNode n2 = head;
		for(int i = 0; i < n; i++){
			if(n2 == null) return pre.next;
			n2 = n2.next;
		}
		while(n2 != null){
			n1 = n1.next;
			n2 = n2.next;
		}
		n1.next = n1.next.next;
		return pre.next;
        
    }
}
