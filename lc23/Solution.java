public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
		return mergeKLists(lists, 0, lists.length - 1);
    }
	public ListNode mergeKLists(ListNode[] lists, int start, int end){
	    if(end < start) return null;
		if(end == start) return lists[start];
		if(end - start == 1) return mergeTwoLists(lists[start], lists[end]);
		int mid = (start + end) / 2;
		ListNode l1 = mergeKLists(lists, start, mid);
		ListNode l2 = mergeKLists(lists, mid + 1, end);
		return mergeTwoLists(l1, l2);
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode res = null;
		if(l1.val < l2.val){
			res = l1;
			res.next = mergeTwoLists(l1.next, l2);
		}else{
			res = l2;
			res.next = mergeTwoLists(l1, l2.next);
		}
		return res;
	}
}
