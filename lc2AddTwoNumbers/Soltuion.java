public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNumbers(l1, l2, 0);
        
    }
	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int count){
		if(l1 == null && l2 == null){
			if(count == 0) return null;
			else return new ListNode(count);
		}
		if(l1 == null) {
			if(count == 0) return l2;
			else{
				int val = l2.val;
				l2.val = (val + count) % 10;
				int c = (val + count) / 10;
				l2.next = addTwoNumbers(null, l2.next, c);
				return l2;
			}
		}
		if(l2 == null) {
			if(count == 0) return l1;
			else{
				int val = l1.val;
				l1.val = (val + count) % 10;
				int c = (val + count) / 10;
				l1.next = addTwoNumbers(l1.next, null, c);
				return l1;
			}
		}
		ListNode res = new ListNode((l1.val + l2.val + count) % 10);
		res.next = addTwoNumbers(l1.next, l2.next, (l1.val + l2.val + count)/ 10 );
		return res;
	}
}
