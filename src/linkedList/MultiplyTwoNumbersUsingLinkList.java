package linkedList;

/**
 * Multiply two numbers represented as a linked list. 
 * Inputs :
 * L1 = 1->2->3->5 
 * L2 = 5->6->3->7
 * 
 * Output :6->9->6->1->6->9->5->null
 * 
 * @author sbalai
 */
public class MultiplyTwoNumbersUsingLinkList {

	AddTwoNumbersUsingLinkedList add = new AddTwoNumbersUsingLinkedList();

	class LLNode {
		Node node;
		LLNode next;
	}

	public Node populateLists() {
		Node first = new Node(1);
		Node firstHead = first;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;

		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		Node head = firstHead;
		System.out.print("First List ==");
		while (head != null) {
			s1.append(head.data);
			System.out.print(head.data + "==>");
			head = head.next;

		}
		System.out.print("null");

		Node second = new Node(5);
		Node secHead = second;
		second.next = new Node(9);
		second = second.next;

		//
		head = secHead;
		System.out.print("\nSecond List ==");
		while (head != null) {
			s2.append(head.data);
			System.out.print(head.data + "==>");
			head = head.next;
		}
		System.out.print("null");

		System.out.print("\n" + s1.toString() + "*" + s2.toString() + "=/n/n");
		Node finaldd = multiply(firstHead, secHead);
		return finaldd;
	}

	/**
	 * Reverse given linked list.
	 * @param node
	 * @return
	 */
	public Node reverse(Node node) {
		Node a = node;
		Node result = null;
		while (a != null) {
			Node temp = result;
			result = new Node(a.data);
			result.next = temp;
			a = a.next;
		}
		return result;
	}

	public Node multiply(Node first, Node second) {
		System.out.print("\nB4 reverse ::");
		Node first1 = reverse(first);
		Node second1 = reverse(second);
		LLNode res = null;
		LLNode resHead = null;
		System.out.println("\nIn Multiplier");
		int i = 0;
		while (first1 != null) {
			Node result = null;
			Node resultHead = null;
			int fromPrev = 0;
			Node second2 = second1;
			while (second2 != null) {
				int val = first1.data * second2.data + fromPrev;
				fromPrev = val / 10;
				val %= 10;
				if (result == null) {
					result = new Node(val);
					resultHead = result;
				} else {
					result.next = new Node(val);
					result = result.next;
				}
				if (second2.next == null && fromPrev > 0) {
					result.next = new Node(fromPrev);
					result = result.next;
				}
				second2 = second2.next;
			}
			if (resultHead != null) {
				int j = 0;
				while (j < i) {
					Node k = new Node(0);
					k.next = resultHead;
					resultHead = k;
					j++;
				}
				if (res == null) {
					res = new LLNode();
					res.node = resultHead;
					resHead = res;
				} else {
					res.next = new LLNode();
					res.next.node = resultHead;
					res = res.next;
				}
			}
			i++;
			first1 = first1.next;
		}

		Node add1 = resHead.node;
		add1 = reverse(add1);
		resHead = resHead.next;

		while (resHead != null) {
			Node s1 = resHead.node;
			s1 = reverse(s1);
			add1 = add.add(s1, add1);
			resHead = resHead.next;
		}

		while (first != null) {
			System.out.print(first.data);
			first = first.next;
		}
		System.out.print("    +   ");
		while (second != null) {
			System.out.print(second.data);
			second = second.next;
		}
		System.out.print("=====");

		while (add1 != null) {
			System.out.print(add1.data);
			add1 = add1.next;
		}
		return add1;
	}

	int length(Node node) {
		int length = 0;
		Node a = node;
		while (a != null) {
			length++;
			a = a.next;
		}
		return length;
	}

	public static void main(String[] args) {
		MultiplyTwoNumbersUsingLinkList multiplier = new MultiplyTwoNumbersUsingLinkList();
		multiplier.populateLists();
	}
}
