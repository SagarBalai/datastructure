package linkedList;

/**
 * Add two number which are provided as linked list 9==>2==>3==>null +
 * 4==>5==>6==>null ================== 1==>3==>7==>9==>null
 * 
 * @author sbalai
 *
 */
public class AddTwoNumbersUsingLinkedList {
	Node firstHead = null;
	Node secHead = null;

	public Node populateLists() {

		Node first = new Node(9);
		firstHead = first;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(8);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
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
		secHead = second;
		second.next = new Node(9);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;

		second.next = new Node(4);
		second = second.next;
		second.next = new Node(5);
		second = second.next;
		// for (int i = 9; i > 5; i--) {
		// Node a = new Node(5);
		// if (second == null) {
		// second = a;
		// secHead = second;
		// } else {
		// second.next = a;
		// second = second.next;
		// }
		// }

		head = secHead;
		System.out.print("\nSecond List ==");
		while (head != null) {
			s2.append(head.data);
			System.out.print(head.data + "==>");
			head = head.next;
		}
		System.out.print("null");

		System.out.print("\n" + s1.toString() + "+" + s2.toString() + "=");
		Node finaldd = add(firstHead, secHead);
		return finaldd;
	}

	/**
	 * Return total node in given linked list.
	 * 
	 * @param node
	 * @return
	 */
	int length(Node node) {
		int length = 0;
		Node a = node;
		while (a != null) {
			length++;
			a = a.next;
		}
		return length;
	}

	/**
	 * It will add given two input linked list and return sum result.
	 * 
	 * @param a1
	 * @param b1
	 * @return
	 */
	public Node add(Node a1, Node b1) {

		Node finalList = null;
		Node finalHead = null;

		Node a = a1;
		Node b = b1;

		int firstLen = length(a);
		int secLen = length(b);

		if (firstLen > secLen) {
			while (firstLen > secLen + 1) {
				if (finalList == null) {
					finalList = new Node(a.data);
					finalHead = finalList;
				} else {
					finalList.next = new Node(a.data);
					finalList = finalList.next;
				}
				a = a.next;
				firstLen--;
			}

			Node c = a.next;
			Node d = b;
			int fromPrev = 0;
			while (c != null && d != null) {
				int v = c.data + d.data;
				if (v > 9) {
					fromPrev = 1;
					break;
				} else if (v < 9) {
					fromPrev = 0;
					break;
				}
				c = c.next;
				d = d.next;
			}
			if (finalList == null) {
				finalList = new Node((a.data + fromPrev) % 10);
				finalHead = finalList;
			} else {
				finalList.next = new Node((a.data + fromPrev) % 10);
				finalList = finalList.next;
			}
			a = a.next;
			firstLen--;

		} else if (secLen > firstLen) {
			while (secLen > firstLen + 1) {
				if (finalList == null) {
					finalList = new Node(b.data);
					finalHead = finalList;
				} else {
					finalList.next = new Node(b.data);
					finalList = finalList.next;
				}
				b = b.next;
				secLen--;
			}

			Node c = b.next;
			Node d = a;
			int fromPrev = 0;
			while (c != null && d != null) {
				int v = c.data + d.data;
				if (v > 9) {
					fromPrev = 1;
					break;
				} else if (v < 9) {
					fromPrev = 0;
					break;
				}
				c = c.next;
				d = d.next;
			}
			if (finalList == null) {
				finalList = new Node((b.data + fromPrev) % 10);
				finalHead = finalList;
			} else {
				finalList.next = new Node((b.data + fromPrev) % 10);
				finalList = finalList.next;
			}
			b = b.next;
			secLen--;

		} else {
			int fromPrev = 0;
			Node c = a.next;
			Node d = b.next;

			while (c != null && d != null) {
				int v = c.data + d.data;
				if (v > 9) {
					fromPrev = 1;
					break;
				} else if (v < 9) {
					fromPrev = 0;
					break;
				}
				c = c.next;
				d = d.next;
			}

			int add = (a.data + b.data + fromPrev) > 9 ? 1 : 0;
			if (add == 1) {
				finalList = new Node(1);
				finalHead = finalList;
			}
			firstLen--;
			secLen--;
		}

		while (a != null && b != null) {
			if (firstLen == secLen) {
				int fromPrev = 0;
				Node c = a.next;
				Node d = b.next;

				while (c != null && d != null) {
					int v = c.data + d.data;
					if (v > 9) {
						fromPrev = 1;
						break;
					} else if (v < 9) {
						fromPrev = 0;
						break;
					}
					c = c.next;
					d = d.next;
				}
				int current = (a.data + b.data + fromPrev) % 10;
				finalList.next = new Node(current);
				finalList = finalList.next;

				a = a.next;
				b = b.next;
				firstLen--;
				secLen--;
			} else if (firstLen > secLen) {
				finalList.next = new Node(a.data);
				finalList = finalList.next;
				a = a.next;
				firstLen--;
			} else if (firstLen < secLen) {
				finalList.next = new Node(b.data);
				finalList = finalList.next;
				b = b.next;
				secLen--;
			}
		}
		return finalHead;
	}

	public static void main(String[] args) {
		AddTwoNumbersUsingLinkedList a = new AddTwoNumbersUsingLinkedList();
		Node add = a.populateLists();
		while (add != null) {
			System.out.print(add.data);
			add = add.next;
		}
	}
}
