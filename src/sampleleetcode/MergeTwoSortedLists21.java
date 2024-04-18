package sampleleetcode;

public class MergeTwoSortedLists21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = null;
		

		while (list1 != null && list2 != null) {
			if (list1.val >= list2.val) {
				addToList(head, list2.val);
				list2 = list2.next;

			} else if (list1.val < list2.val) {
				addToList(head, list1.val);
				list1 = list1.next;
			}
			
		}
		while (list1 != null && list2 == null) {
			addToList(head, list1.val);
			list1 = list1.next;
		}
		if (list2 != null && list1 == null) {
			addToList(head, list2.val);
			list2 = list2.next;
		}
		return head;
	}

	public static ListNode addToList(ListNode head, int val) {
		ListNode newNode = new ListNode(val);
		if(head == null) {
			return newNode;
		} else {
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			return current;
		}

	}

}
