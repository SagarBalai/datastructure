package btree;
public class BTreeUtil {
	public static TreeNode populateTree() {
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

		TreeNode lt = right.left;
		lt.left = new TreeNode(13);
		lt.right = new TreeNode(23);

		TreeNode rt = left.right;
		rt.right = new TreeNode(13);
		rt.left = new TreeNode(23);

		return top;
	}

	public static void printTree(TreeNode node) {
		if (node == null) {
			return;
		}
		// if (node.left != null && node.right != null)
		System.out.print("\n" + node.value);
		if (node.left != null) {
			System.out.print("\n\t==left==>" + node.left.value);
		}
		if (node.right != null) {
			System.out.print("\n\t==right==>" + node.right.value);

		}
		printTree(node.left);
		printTree(node.right);
	}

}
