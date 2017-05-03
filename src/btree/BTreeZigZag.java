package btree;

/**
 * Print the tree in zigzag order :: BFS (Breadth first search is more useful
 * than DFS (inorder,preorder,postorder) as it has to print tree from root and
 * not from leaf.. ) For any situation where root and around is needed BFS is
 * useful like this example as well as like find first seq of nodes from root
 * where addition is k.
 * 
 * @author sbalai
 *
 */
public class BTreeZigZag {
	TreeNode root;

	public void printSpiral(TreeNode node) {
		int h = height(node);
		int i;

		boolean ltr = false;
		for (i = 1; i <= h; i++) {
			printGivenLevel(node, i, ltr);
			ltr = !ltr;
		}

	}

	/*
	 * Compute the "height" of a tree
	 */
	int height(TreeNode node) {
		if (node == null)
			return 0;
		else {

			int lheight = height(node.left);
			int rheight = height(node.right);

			return Math.max(lheight, rheight) + 1;
		}
	}

	void printGivenLevel(TreeNode node, int level, boolean ltr) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.value + " ");
		else if (level > 1) {
			if (ltr != false) {
				printGivenLevel(node.left, level - 1, ltr);
				printGivenLevel(node.right, level - 1, ltr);
			} else {
				printGivenLevel(node.right, level - 1, ltr);
				printGivenLevel(node.left, level - 1, ltr);
			}
		}
	}

	public static void main(String[] args) {
		TreeNode node = BTreeUtil.populateTree();
		BTreeUtil.printTree(node);
		BTreeZigZag t = new BTreeZigZag();
		System.out.print("\n\nSpiral ::");
		t.printSpiral(node);

		int level = 3;
		System.out.print("\n\nLevel " + level + " nodes::");
		t.printGivenLevel(node, 3, true);
	}
}
