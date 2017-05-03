package linkedList;

import java.util.Stack;

public class PalindromeLinkedListFinder {

	/**
	 * To check whether linked list is palindrome or not.
	 * @param node
	 * @return
	 */
	public boolean isPalindrome(Node node) {
		Stack<Integer> stack = new Stack<>();
		Node fp = node.next, sp = node;

		while (fp != null) {
			stack.push(sp.data);
			sp = sp.next;
			if (fp.next != null) {
				if (fp.next.next == null) {
					sp = sp.next;
				}
				fp = fp.next.next;

			} else {
				fp = null;
			}
		}

		while (sp != null) {
			int data = stack.pop();
			if (data != sp.data) {
				return false;
			}
			sp = sp.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Node first = new Node(2), head = first;

		first.next = new Node(3);
		first.next.next = new Node(4);
		first.next.next.next = new Node(3);
		first.next.next.next.next = new Node(3);

		first.next.next.next.next.next = new Node(3);
		first.next.next.next.next.next.next = new Node(4);
		first.next.next.next.next.next.next.next = new Node(3);
		first.next.next.next.next.next.next.next.next = new Node(2);

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		PalindromeLinkedListFinder pal = new PalindromeLinkedListFinder();
		System.out.println(" Given List is Palindrome ="
				+ pal.isPalindrome(head));
	}
}
