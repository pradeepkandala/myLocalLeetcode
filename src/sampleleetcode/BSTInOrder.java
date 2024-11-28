package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class BSTInOrder {

	public static void main(String[] args) {
		
		
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inOrderTraversalHelper(root, result);
		return result;

	}

	private void inOrderTraversalHelper(TreeNode root, List<Integer> result) {
		if(root != null) {
			inOrderTraversalHelper(root.left,result);
		result.add(root.val);
		inOrderTraversalHelper(root.right,result);
		}
	}
}
