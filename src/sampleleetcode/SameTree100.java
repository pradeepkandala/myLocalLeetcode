package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class SameTree100 {

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		// Check if one of the nodes is null (but not both)
		if (p == null || q == null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}

		List<Object> result = new ArrayList<>();
		List<Object> result2 = new ArrayList<>();
		inOrderTraversalHelper(p, result);
		inOrderTraversalHelper(q, result2);
		if (result.size() != result2.size()) {
			return false; // Early return for size mismatch
		}

		for (int i = 0; i < result.size(); i++) {
			if (result.get(i) != result2.get(i)) {
				return false;
			}

		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

	private static void inOrderTraversalHelper(TreeNode p, List<Object> result) {
		if (p == null) {
			return;
		}

		inOrderTraversalHelper(p.left, result);
		result.add(p.val);
		inOrderTraversalHelper(p.right, result);

	}

}
