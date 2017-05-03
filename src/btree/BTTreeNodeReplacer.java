package btree;

/**
 * 
 * Given a BST (Binary Search Tree) , Each node value should replace with sum of
 * the node which are greater-than the given node.
 * 
 * conditions : No Extra space / variable can use Modify the existing tree in
 * optimal way
 * 
 * @author sbalai
 *
 */
public class BTTreeNodeReplacer {

	public TreeNode populateTree() {
		TreeNode t1 = new TreeNode(60);
		TreeNode top = t1;
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(90);
		top.left = left;
		top.right = right;

		left.left = new TreeNode(20);
		left.right = new TreeNode(40);

		right.left = new TreeNode(80);
		right.right = new TreeNode(95);

		// TreeNode lt = right.left;
		// lt.left = new TreeNode(13);
		// lt.right = new TreeNode(23);
		//
		// TreeNode rt = left.right;
		// rt.right = new TreeNode(13);
		// rt.left = new TreeNode(23);

		return top;
	}

	public int update(TreeNode tree, int value) {
		if (tree == null) {
			return value;
		}
		int rtreeVal = update(tree.right, value);
		if (tree.right != null) {
			tree.value = tree.value + rtreeVal;
		}
		update(tree.left, tree.value);
		if (tree.left != null) {
			return tree.value + tree.left.value;
		}

		return tree.value;
	}

	public int updates(TreeNode tree, int value) {
		if (tree == null) {
			return value;
		}
		tree.value = tree.value + updates(tree.right, value);
		return updates(tree.left, tree.value);

	}

	public int updates_working(TreeNode tree, int value) {
		if (tree == null) {
			return value;
		}
		int rVal = updates_working(tree.right, value);
		tree.value = tree.value + rVal;

		int lVal = updates_working(tree.left, tree.value);
		return lVal;

	}

	public void printTree(TreeNode node) {
		if (node == null) {
			return;
		}
		if (node.left != null && node.right != null)
			System.out.print("\n" + node.value);
		if (node.left != null) {
			System.out.print("==left==>" + node.left.value);
		}
		if (node.right != null) {
			System.out.print("==right==>" + node.right.value);

		}
		printTree(node.left);
		printTree(node.right);
	}

	public static void main(String[] args) {
		BTTreeNodeReplacer replacer = new BTTreeNodeReplacer();
		TreeNode bst = replacer.populateTree();
		replacer.printTree(bst);

		replacer.updates(bst, 0);
		System.out.println("\nDone");

		System.out
				.println("\n Expected Result ::\n325 ==left==>395==right==>185");
		System.out.println("395 ==left ==> 415 ==Right==>365");
		System.out.println("185==Left==>265==Right==>95");

		System.out.println("Actual Result::");
		replacer.printTree(bst);

	}
}
