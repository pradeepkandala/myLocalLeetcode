package sampleleetcode;

import java.util.ArrayList;

public class LLExample {

	public static void main(String[] args) {
		ListNode head = new ListNode(5,new ListNode(6));
		ListNode n = middleNode(head);
		System.out.println(n.toString());
		
	}

	public static ListNode middleNode(ListNode head) {
		ListNode middle = head;
		ListNode end = head;
		
		while(end.next != null && end.next.next!=null) {
			middle=middle.next;
			end= end.next.next;
		}	
		return middle;
	}
}
	
	 


