package leetcode.medium;

public class DeleteMiddleNodeOfLinkedList2095 {

	public static void main(String[] args) {
		
		
				
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		ListNode node3 = new ListNode(7);
		ListNode node2 = new ListNode(4);
		ListNode node1 = new ListNode(3);
		ListNode node0 = new ListNode(1);
		node0.next= node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next= node5;
		node5.next = node6;
		System.out.println(deleteMiddle(node0));

	}

	public static ListNode deleteMiddle(ListNode head) {
		ListNode head2 = head;
		ListNode dummyNode = new ListNode(0);
		ListNode current = dummyNode;
		int count = 0;

		while (head2 != null) {
			count++;
			head2 = head2.next;
		}
		int mid = count / 2;
		System.out.println(mid);
		count = 0;
		while (head != null) {
			if(count == mid) {
				head = head.next;
			} else {
				current.next = new ListNode(head.val);
	            current = current.next;
				head= head.next;
			}
			count++;
		}

		return dummyNode.next;

	}

}
