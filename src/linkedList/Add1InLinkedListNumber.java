package linkedList;
/**
 * Add 1 to the integer represented by a linked list with O(n) time, O(1) space,
 * no recursion(stack space) and without reversing the linked list.
 * 
 * @author sbalai
 */
public class Add1InLinkedListNumber {
	public static void main(String[] args) {
		Add1InLinkedListNumber ad1 = new Add1InLinkedListNumber();
		ad1.populateLists();
	}

	class Node {
		private int data;
		private Node next;

		public Node(int val) {
			this.data = val;
		}
	}

	public void populateLists() {
		Node first = new Node(9);
		Node firstHead = first;
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
		first.next = new Node(9);

		add1(firstHead);
	}

	public int length(Node node) {
		Node a = node;
		int length = 0;
		while (a != null) {
			length++;
			a = a.next;
		}
		return length;
	}

	public void add1(Node node) {
		Node a = node;
		while (a != null) {
			System.out.print(a.data);
			a = a.next;
		}
		int length = length(node);
		Node finalList = node;
		Node resHead = finalList;
		if (length > 2) {
			while (length > 2) {
				node = node.next;
				length--;
			}
		}
		node.data = node.data + (node.next.data + 1 > 9 ? 1 : 0);
		node.next.data = (node.next.data + 1) % 10;

		System.out.print("+1 ==");
		while (resHead != null) {
			System.out.print(resHead.data);
			resHead = resHead.next;
		}
	}
}
