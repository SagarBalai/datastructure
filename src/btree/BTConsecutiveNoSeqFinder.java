package btree;

import linkedList.Node;

public class BTConsecutiveNoSeqFinder {
	public TreeNode populateTree() {
		TreeNode t1 = new TreeNode(90);
		TreeNode top = t1;
		TreeNode fleft = new TreeNode(1);
		TreeNode fright = new TreeNode(66);
		top.left = fleft;
		top.right = fright;

		fleft.left = new TreeNode(2);
		fleft.right = new TreeNode(4);

		fleft.left.left = new TreeNode(3);
		fleft.left.left.left = new TreeNode(4);
		fleft.left.left.left.left = new TreeNode(5);
		fleft.left.left.left.left.left = new TreeNode(5);

		fleft.left.left.left.left.right = new TreeNode(6);

		fleft.left.left.left.left.right.left = new TreeNode(9);
		fleft.left.left.left.left.right.left.right = new TreeNode(10);

		fright.right = new TreeNode(67);
		fright.left = new TreeNode(57);

		fright.right.right = new TreeNode(68);
		fright.right.left = new TreeNode(90);
		fright.right.right.left = new TreeNode(69);
		fright.right.right.left.left = new TreeNode(70);

		return top;
	}

	public void findLargestConcecutive(TreeNode root, int fromLast) {
		if (root == null) {
			return;
		}
		if (root.left != null) {

			if (Math.abs(root.value - root.left.value) == 1) {
				fromLast += 1;
			}
			findLargestConcecutive(root.left, fromLast);

		}
		if (root.right != null) {
			if (Math.abs(root.value - root.right.value) == 1) {
				fromLast += 1;
			}
			findLargestConcecutive(root.right, fromLast);

		}
		if (fromLast > max) {
			max = fromLast;
			fromLast = 0;
		}
	}

	int max = 0;

	public int findLargestConcecutive(TreeNode node) {
		findLargestConcecutive(node, 1);
		return max;
	}

	// Node llHead = null;
	public static StringBuilder sb = new StringBuilder();

	public int find(TreeNode first, TreeNode next) {
		int length = 0;

		if (first == null || next == null) {
			return length;
		}
		if ((first.value - next.value == -1)
				|| (next.value - first.value == -1)) {
			length++;
		} else if (length <= 1) {
			length = 0;
		}

		length += find(next, next.right);
		length += find(next, next.left);
		return length;
	}

	Node ll = null;
	public Node llHead = null;

	public void find1(TreeNode first, TreeNode next) {

		if (first == null)
			return;

		if (first == next) {
			ll = new Node(first.value);
			llHead = ll;
		}
		if (first != null && next == null) {
			Node a = llHead;
			int i = 1;
			while (a.next != null) {
				i++;
				a = a.next;
			}
			if (i < 2) {
				ll = new Node(first.value);
				llHead = ll;
			} else {
				a.next = new Node(first.value);
			}
			return;
		}
		if ((first.value - next.value == -1)
				|| (next.value - first.value == -1)) {
			ll.next = new Node(first.value);
			ll = ll.next;
		} else {
			Node a = llHead;
			int i = 0;
			while (a != null) {
				i++;
				a = a.next;
			}
			if (i < 2) {
				ll = new Node(next.value);
				llHead = ll;
			}
		}

		find1(next, next.right);
		find1(next, next.left);
	}

	public Node findConsecutiveNoSeq(TreeNode node, Node seq) {
		TreeNode head = node;

		if (head == null) {
			return seq;
		}
		if (seq == null) {
			seq = new Node(node.value);
			sb.append(node.value);
		} else {
			Node a = seq;
			int i = 0;
			while (a != null) {
				i++;
				a = a.next;
			}
			if (i < 2) {
				seq = new Node(node.value);
				sb = new StringBuilder();
				sb.append(node.value);
			} else {
				if (seq.data - node.value == 1 || node.value - seq.data == 1) {
					Node aa = new Node(node.value);
					seq.next = aa;
					sb.append("," + node.value);
				}
			}
		}

		findConsecutiveNoSeq(node.right, seq);
		findConsecutiveNoSeq(node.left, seq);
		return null;
	}

	public static void main(String[] args) {
		BTConsecutiveNoSeqFinder concFinder = new BTConsecutiveNoSeqFinder();
		TreeNode node = concFinder.populateTree();
		BTreeUtil.printTree(node);

		concFinder.findLargestConcecutive(node);
		System.out.println("\n\nConcecutive numbers :" + concFinder.max);
	}
}
