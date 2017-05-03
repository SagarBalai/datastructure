package linkedList;

/**
 * Remove duplicate elements in sorted list.
 * eg.
 * Input : 1 ->2->2->2->5->6->7->7->null
 * Output :1->2->5->6->7->null
 * @author sbalai
 *
 */
public class DuplicateRemoverInSortedList {
	/**
	 * Remove duplicates for given list.
	 * @param node
	 */
	public void removeDuplicate(Node node) {
		Node head = node;
		while (head != null && head.next != null) {
			if (head.data == head.next.data) {
				head.next = head.next.next;
			}
			if (head.next != null && (head.data != head.next.data))
				head = head.next;
		}
	}

	public static void main(String[] args) {
		Node first = new Node(2), head = first;

		first.next = new Node(3);
		first.next.next = new Node(3);
//		first.next.next.next = new Node(3);
//		first.next.next.next.next = new Node(5);
//
//		first.next.next.next.next.next = new Node(5);
//		first.next.next.next.next.next.next = new Node(6);
//		first.next.next.next.next.next.next.next = new Node(7);
//		first.next.next.next.next.next.next.next.next = new Node(7);

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		DuplicateRemoverInSortedList dupl = new DuplicateRemoverInSortedList();
		dupl.removeDuplicate(head);

		System.out.print("\nOutput:");
		f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

	}
}
