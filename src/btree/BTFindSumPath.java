package btree;

/**
 * Root to leaf path sum equal to a given number Given a binary tree and a
 * number, return true if the tree has a root-to-leaf path such that adding up
 * all the values along the path equals the given number. Return false if no
 * such path can be found.
 * 
 * @author sbalai
 *
 */
public class BTFindSumPath {

	/**
	 * Check if tree has sum from root to leaf equal to 'no'.
	 * 
	 * @param node
	 *            : Root node
	 * @param no
	 *            : total sum : input
	 * @return : boolean --> whether tree has sum equal no.
	 */
	public boolean hasPathSum(TreeNode node, int no) {

		if (node == null) {
			return (no == 0);
		} else {
			int subSum = no - node.value;
			if (subSum == 0 && node.left == null && node.right == null) {
				return true;
			}
			return hasPathSum(node.left, subSum)
					|| hasPathSum(node.right, subSum);
		}
	}

	public static void main(String[] args) {
		TreeNode node = BTreeUtil.populateTree();
		BTreeUtil.printTree(node);
		BTFindSumPath sumPath = new BTFindSumPath();
		System.out.println("\n" + sumPath.hasPathSum(node, 143));
	}
}
