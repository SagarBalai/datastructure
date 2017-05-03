package linkedList;

/**
 * Swap linked list element.. only consecutive elements.
 * 
 * @author sbalai
 *
 */
public class SwapLinkedList {

	public Node swap(Node head) {
		Node newHead = head;

		while (newHead != null && newHead.next != null) {
			int a = newHead.data;
			newHead.data = newHead.next.data;
			newHead.next.data = a;
			newHead = newHead.next.next;
		}

		return head;
	}

	public Node populateLists() {

		Node first = new Node(1);
		Node firstHead = first;
		first.next = new Node(2);
		first = first.next;
		first.next = new Node(3);
		first = first.next;
		first.next = new Node(4);
		first = first.next;
		first.next = new Node(5);
		first = first.next;
		first.next = new Node(6);
		// first = first.next;
		// first.next = new Node(5);
		// first = first.next;
		// first.next = new Node(8);
		// first = first.next;
		// first.next = new Node(4);
		// first = first.next;
		// first.next = new Node(5);
		// first = first.next;
		return firstHead;
	}

	public static void main(String[] args) {
		SwapLinkedList swap = new SwapLinkedList();
		Node node = swap.populateLists();
		Node a = node;
		while (a != null) {
			System.out.print(a.data + " ");
			a = a.next;
		}
		Node swapNode = swap.swap(node);
		System.out.println();
		while (swapNode != null) {
			System.out.print(swapNode.data + " ");
			swapNode = swapNode.next;
		}
	}
}
