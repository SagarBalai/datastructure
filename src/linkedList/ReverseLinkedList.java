package linkedList;

public class ReverseLinkedList {

	public Node reverse(Node node) {
		Node result = null;

		while (node != null) {
			Node temp = result;
			result = node;
			node = node.next;
			result.next = temp;
		}

		return result;
	}

	public static void main(String[] args) {

		Node first = new Node(2), head = first;

		for (int j = 3; j < 9; j++) {
			first.next = new Node(j);
			first = first.next;
		}

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		ReverseLinkedList rev = new ReverseLinkedList();
		Node reverse = rev.reverse(head);

		System.out.print("\n reverse List:");
		f = reverse;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

	}
}
