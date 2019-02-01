package algirithm.exercise;

/*
 * Remove Nth Node From End of List
 */
public class Exercise_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		ListNode fast = dummy;
		ListNode slow = dummy;
		dummy.next = head;
		
		for(int i = 0 ; i <= n ; i++) {
			fast = fast.next;
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return dummy.next;
		
		
	}
}
