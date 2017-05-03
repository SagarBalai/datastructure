package linkedList;

/**
 * Find out nth element from last element in the linked list.
 * @author sbalai
 *
 */
public class NthFromLastInLinkedList {

	public Node nthFromLastLL(Node node, int n) {
		Node nthNode = null;
		Node head = node;
		while (node != null) {
			if (n == 1) {
				if (nthNode == null) {
					nthNode = head;
				} else {
					nthNode = nthNode.next;
				}
			} else {
				n--;
			}
			node = node.next;
		}

		return nthNode;
	}

	public static void main(String[] args) {
		Node first = new Node(1), head = first;
		for (int i = 4; i < 10; i++) {
			first.next = new Node(i);
			first = first.next;
		}
		System.out.print("\n First List:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		NthFromLastInLinkedList nth = new NthFromLastInLinkedList();
		Node nthElem = nth.nthFromLastLL(head, 1);
		if (nthElem == null) {
			System.out.print("\n Total number are less in linked list.");
		} else {
			System.out.println("\nNth element :" + nthElem.data);
		}
	}
}
