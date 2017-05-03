package btree;

/**
 * Write a program to check whether it is a valid binary tree or not.
 * 
 * @author sbalai
 *
 */
public class BinaryTreeChecker {
	// class TreeNode {
	// int value;
	// TreeNode left;
	// TreeNode right;
	//
	// public TreeNode(int val) {
	// this.value = val;
	// }
	// }

	public TreeNode populateTree() {
		TreeNode t1 = new TreeNode(60);
		TreeNode top = t1;
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(90);
		top.left = left;
		top.right = right;

		left.left = new TreeNode(20);
		left.right = new TreeNode(40);

		right.right = new TreeNode(95);
		right.left = new TreeNode(80);
		// TreeNode lt = right.left;
		// lt.left = new TreeNode(13);
		// lt.right = new TreeNode(23);
		//
		// TreeNode rt = left.right;
		// rt.right = new TreeNode(13);
		// rt.left = new TreeNode(23);

		return top;
	}

	public boolean isBinary(TreeNode node) {

		if (node == null) {
			return true;
		}

		if ((node.left != null && node.value < node.left.value)
				|| (node.right != null && node.value > node.right.value)) {
			return false;
		}

		return isBinary(node.left) && isBinary(node.right);
	}

	public static void main(String[] args) {
		BinaryTreeChecker checker = new BinaryTreeChecker();
		TreeNode node = checker.populateTree();
		System.out.println(checker.isBinary(node));
	}
}
