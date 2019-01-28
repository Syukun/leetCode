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
 */
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		ListNode ln1 = l1,ln2 = l2;
		while(ln1 != null || ln2 != null) {
//			int x = ln1 == null? 
		}
		
		
		return cur;
	}
    
	public static void main(String[] args) {
		
	}

}