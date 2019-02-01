package algirithm.exercise;

/*
 * Delete Node in a Linked List
 */
public class Exercise_237 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
