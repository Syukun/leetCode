package algirithm.exercise;

/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example :
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * Explanation: 342 + 465 = 807.
 * 
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val = x;};
}


public class Exercise_2_Add_Two_Number {
	
/*
 * 	Solution:
 * 	Elementary Math
 * 
 * Question ? why must use curr and what if we dont use curr to substitute dummy
 * 
 */
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		ListNode ln1 = l1,ln2 = l2;
		int carry = 0;
		while(ln1 != null || ln2 != null) {
			int v1 = (ln1 != null)? ln1.val : 0;
			int v2 = (ln2 != null)? ln2.val : 0;
			int sum = carry + v1 + v2;
			carry = sum/10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			if(ln1!=null) ln1=ln1.next;
			if(ln2!=null) ln2=ln2.next;
			
		}
		if(carry>0) {
			curr.next = new ListNode(carry);
		}
		
		return dummy.next;
	}
    
	public static void main(String[] args) {
		
	}

}