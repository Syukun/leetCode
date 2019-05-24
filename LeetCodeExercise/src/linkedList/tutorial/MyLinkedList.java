package linkedList.tutorial;

public class MyLinkedList {
	int val;
	MyLinkedList next;
	
	public MyLinkedList() {
		
	}

	public int get(int index) {
		MyLinkedList head = new MyLinkedList();
		head.val = 0;
		head.next = this;
		if(head.next!=null) {
			if(index == 0) {
				return head.next.val;
			}else {
				head = head.next;
				this.val = this.next.val;
				this.next = this.next.next;
				return head.get(index-1);
			}
		}else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		MyLinkedList test0 = new MyLinkedList();
		test0.val=0;
		test0.next=null;
		
		MyLinkedList test1 = new MyLinkedList();
		test1.val=1;
		test1.next=test0;
		
		MyLinkedList test2 = new MyLinkedList();
		test2.val=2;
		test2.next=test1;
		
		MyLinkedList test3 = new MyLinkedList();
		test3.val=3;
		test3.next=test2;
		
		int a = test3.get(0);
		System.out.println(a);

	}

}
