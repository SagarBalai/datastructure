package btree;
/**
 * Sum of all the numbers that are formed from root to leaf paths Given a binary
 * tree, where every node value is a Digit from 1-9 .Find the sum of all the
 * numbers which are formed from root to leaf paths.
 * 
 * For example consider the following Binary Tree.
 * 
 * 6 / \ 3 5 / \ \ 2 5 4 / \ 7 4 There are 4 leaves, hence 4 root to leaf paths:
 * Path Number 6->3->2 632 6->3->5->7 6357 6->3->5->4 6354 6->5>4 654 Answer =
 * 632 + 6357 + 6354 + 654 = 13997
 * 
 * @author sbalai
 *
 */
public class BTAddNoFromRootToLeaf {

	public TreeNode populateTree() {
		TreeNode t1 = new TreeNode(1);
		TreeNode top = t1;
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		top.left = left;
		top.right = right;

		left.left = new TreeNode(4);
		left.right = new TreeNode(5);

//		right.left = new TreeNode(80);
//		right.right = new TreeNode(95);
//
//		TreeNode lt = right.left;
//		lt.left = new TreeNode(13);
//		lt.right = new TreeNode(23);
//
//		TreeNode rt = left.right;
//		rt.right = new TreeNode(13);
//		rt.left = new TreeNode(23);
//
		return top;
	}

	public int sum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		sum = sum * 10 + root.value;
		if (root.left == null && root.right == null) {
			return sum;
		}
		return sum(root.left, sum) + sum(root.right, sum);
	}

	public static void main(String[] args) {
		BTAddNoFromRootToLeaf btAdd = new BTAddNoFromRootToLeaf();
		TreeNode root =btAdd.populateTree();
		System.out.println(btAdd.sum(root, 0));

	}
}
