package sampleleetcode;

public class ReverseLinkedList208 {

	public static void main(String[] args) {
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		ListNode node3 = new ListNode(7);
		ListNode node2 = new ListNode(4);
		ListNode node1 = new ListNode(3);
		ListNode node0 = new ListNode(1);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		ListNode node = reverseList(node0);
		
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}

	}
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		
		while(current != null) {
			ListNode nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		return prev;
	
	}

	/*public static ListNode reverseList(ListNode head) {
		ListNode dummyNode = new ListNode();
		ListNode current = dummyNode;
		ListNode node = head;

		int count = 0;
		while (node != null) {
			node = node.next;
			count++;
		}
		while (count > 0) {
			current.next = new ListNode(getElement(count, head));
			current = current.next;
			count--;
		}
		return dummyNode.next;
	}

	public static int getElement(int count, ListNode head) {
		for (int i = 0; i < count - 1; i++) {
			head = head.next;
		}
		return head.val;
	}*/
}
