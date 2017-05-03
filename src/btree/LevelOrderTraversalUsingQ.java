package btree;

import java.util.Queue;
import java.util.LinkedList;

class LevelOrderTraversalUsingQ {

	TreeNode root;

	/*
	 * Given a binary tree. Print its nodes in level order using array for
	 * implementing queue
	 */
	void printLevelOrder() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {

			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.value + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	void printLevelOrderInZigZag() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean ltr = false;
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.value + " ");
			if (ltr) {
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}

				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			} else {
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
			}
			ltr = !ltr;
		}
	}

	public static void main(String args[]) {
		LevelOrderTraversalUsingQ tree_level = new LevelOrderTraversalUsingQ();
		tree_level.root = new TreeNode(1);
		tree_level.root.left = new TreeNode(2);
		tree_level.root.right = new TreeNode(3);
		tree_level.root.left.left = new TreeNode(4);
		tree_level.root.left.right = new TreeNode(5);

		// tree_level.root.right.left = new TreeNode(6);
		// tree_level.root.right.right = new TreeNode(7);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
		System.out.println("Level order zigzag traversal of binary tree is - ");
		tree_level.printLevelOrderInZigZag();
	}
}