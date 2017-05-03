package btree;

import linkedList.Node;

public class BTConstructSortedList {

	Node head;

	public TreeNode sortedListToBST(Node node) {
		head = node;
		int count = 0;
		Node a = node;
		while (a != null) {
			count++;
			a = a.next;
		}

		TreeNode result = sortedListToBSTRecur(count);
		System.out.println("Done");
		return result;
	}

	/**
	 * Convert linked list to binary search tree.
	 * 
	 * @param n : linked list count.
	 * @return : Binary Search tree.
	 */
	TreeNode sortedListToBSTRecur(int n) {
		if (n <= 0)
			return null;

		TreeNode left = sortedListToBSTRecur(n / 2);
		TreeNode root = new TreeNode(head.data);
		root.left = left;

		head = head.next;
		root.right = sortedListToBSTRecur(n - n / 2 - 1);
		return root;
	}

	/**
	 * Populate sorted ascending linked list.
	 * 
	 * @return
	 */
	public Node populatedSortedLL() {
		Node node = new Node(1);
		Node head = node;

		for (int i = 2; i < 10; i++) {
			node.next = new Node(i);
			node = node.next;
		}
		return head;
	}

	public static void main(String[] args) {
		BTConstructSortedList btFromSL = new BTConstructSortedList();
		Node node = btFromSL.populatedSortedLL();
		btFromSL.sortedListToBST(node);
	}
}
