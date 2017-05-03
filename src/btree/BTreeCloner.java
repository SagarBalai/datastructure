package btree;
/**
 * Clone the binary tree.
 * 
 * @author sbalai
 */
public class BTreeCloner {

	public TreeNode clones(TreeNode node) {
		TreeNode res = null;
		if (node == null)
			return null;
		res = new TreeNode(node.value);
		res.left = clones(node.left);
		res.right = clones(node.right);
		return res;
	}

	public static void main(String[] args) {
		BTreeCloner cloner = new BTreeCloner();
		TreeNode node = BTreeUtil.populateTree();
		System.out.print("\n=======Original Tree:: =========\n");
		BTreeUtil.printTree(node);

		TreeNode clonedTree = cloner.clones(node);
		System.out.print("\n=======Cloned Tree:: =========\n");
		BTreeUtil.printTree(clonedTree);
	}
}
