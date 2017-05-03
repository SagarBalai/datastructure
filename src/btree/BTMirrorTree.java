package btree;
/**
 * find the given Binary tree is mirrored tree or not should be like
 * 
 * 60 / \ 30 30 / \ / \ 20 50 50 20
 * 
 * @author sbalai
 *
 */
public class BTMirrorTree {
	class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.value = val;
		}
	}

	public TreeNode populateTree() {
		TreeNode t1 = new TreeNode(60);
		TreeNode top = t1;
		TreeNode left = new TreeNode(30);
		TreeNode right = new TreeNode(30);
		top.left = left;
		top.right = right;
		left.left = new TreeNode(20);
		right.right = new TreeNode(20);

		left.right = new TreeNode(50);
		right.left = new TreeNode(50);
		TreeNode lt = right.left;
		lt.left = new TreeNode(13);
		lt.right = new TreeNode(23);

		TreeNode rt = left.right;
		rt.right = new TreeNode(13);
		rt.left = new TreeNode(23);

		return top;
	}

	public boolean isMirror(TreeNode ltree, TreeNode rtree) {
		boolean isMirror = true;
		if (ltree == null && rtree == null) {
			return true;
		}
		if ((ltree == null && rtree != null)
				|| (rtree == null && ltree != null)
				|| ((rtree != null && ltree != null) && ltree.value != rtree.value)) {
			return false;
		}

		isMirror = isMirror(ltree.left, rtree.right);
		if (!isMirror) {
			return false;
		}

		isMirror = isMirror(ltree.right, rtree.left);
		if (!isMirror) {
			return false;
		}

		return isMirror;
	}

	public boolean isMirrored(TreeNode node) {
		if (node != null) {
			return isMirrored(node.left, node.right);
		}
		return false;
	}

	public boolean isMirrored(TreeNode left, TreeNode right) {
		if (left == null && right == null)
			return true;
		if (left == null ^ right == null)
			return false;
		if (left.value == right.value) {
			return (isMirrored(left.left, right.right) && isMirrored(
					left.right, right.left));
		}
		return false;
	}

	public static void main(String[] args) {
		BTMirrorTree mirror = new BTMirrorTree();
		TreeNode bst = mirror.populateTree();
		System.out.println(mirror.isMirror(bst.left, bst.right));
	}
}
