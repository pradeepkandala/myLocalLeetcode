package leetcode.medium;



public class OddEvenLinkedList328 {
	public static void main(String args[]) {
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
		System.out.println(oddEvenList(node0));
	}

	public static ListNode oddEvenList(ListNode head) {
		ListNode dummyNode = new ListNode();
		ListNode current = dummyNode;
        ListNode even = new ListNode();
        ListNode currentEven = even;
		
		ListNode odd = head;
		int count = 1;
		
		while(odd != null) {
			if(count%2==1) {
				current.next = new ListNode(odd.val);
				current = current.next;
			} else {
                currentEven.next = new ListNode(odd.val);
                currentEven = currentEven.next;
            }
            odd = odd.next;
            count++;
			
		}
        while(even.next != null){
            current.next = new ListNode(even.next.val);
			current = current.next;
            even.next = even.next.next;
        }
  
		return dummyNode.next;

	}

}
