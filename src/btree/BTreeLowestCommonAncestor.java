package btree;
import java.util.Stack;

public class BTreeLowestCommonAncestor {

	public TreeNode lca(TreeNode root, int v1, int v2) {

		return null;
	}

	public boolean findPath(TreeNode root, Stack<Integer> stack, int val) {
		if (root == null) {
			return false;
		}
		stack.push(root.value);
		if (root.value == val) {
			return true;
		}

		if (findPath(root.left, stack, val) || findPath(root.right, stack, val)) {
			return true;
		}
		stack.pop();
		return false;
	}

	public static void main(String[] args) {
		BTreeLowestCommonAncestor lca = new BTreeLowestCommonAncestor();
		TreeNode root = BTreeUtil.populateTree();
		
		int firstNumber =30;
		int secNumber =20;
		
		BTreeUtil.printTree(root);
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		if (lca.findPath(root, s1, firstNumber ) && lca.findPath(root, s2, secNumber)) {
			int oldSameVal = 0;
			int size = Math.min(s1.size(), s2.size());
			int i = 0;
			for (i = 0; i < size; i++) {
				if (s1.get(i) != s2.get(i)) {
					oldSameVal = s1.get(i - 1);
					break;
				}
			}
			// if both numbers are on the same part of tree of root.
			if(oldSameVal ==0 )
			{
				oldSameVal = s1.get(i-1);
			}
			if (oldSameVal != 0) {
				System.out.println("\nCommon Ancestor :" + oldSameVal);
			} else {
				System.out.println("No common Ancestor");
			}
		}
		else
		{
			System.out.println("\nNo common ancestor, one of the value is not present in tree.");
		}

	}
}
