package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfLinkedList2130 {

	public static void main(String[] args) {

	}

	public static int pairSum(ListNode head) {
		int max = 0;
		List<Integer> fullList = new ArrayList<>();
		while (head != null) {
			fullList.add(head.val);
			head = head.next;
		}
		int mid = fullList.size() / 2;
		for (int i = 0; i < mid; i++) {
			if (max < (fullList.get(i) + fullList.get(mid + mid - 1 - i)))
				max = fullList.get(i) + fullList.get(mid + mid - 1 - i);

		}

		return max;
	}

}
