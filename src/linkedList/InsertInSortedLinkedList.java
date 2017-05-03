package linkedList;

/**
 * Given a linked list which is sorted, how will you insert in sorted way
 * 
 * @author sbalai
 *
 */
public class InsertInSortedLinkedList {

	public Node insert(Node list, Node newNode) {

		boolean isInserted = false;
		Node head = list;
		while (list != null && list.next != null) {
			if (newNode.data < list.data) {
				Node temp = head;
				head = newNode;
				head.next = temp;
				isInserted = true;
				break;
			} else {
				if (newNode.data > list.data && newNode.data < list.next.data) {
					Node temp = list.next;
					list.next = newNode;
					newNode.next = temp;
					isInserted = true;
					break;
				}
			}
			list = list.next;
		}
		if (!isInserted) {
			list.next = newNode;
		}
		return head;
	}

	public static void main(String[] args) {

		Node first = new Node(2), head = first;

		for (int j = 3; j < 20; j=j+4) {
			first.next = new Node(j);
			first = first.next;
		}

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

	InsertInSortedLinkedList insert = new InsertInSortedLinkedList();
		Node newList = insert.insert(head, new Node(1));// tried with 1,20,30,15 --- working fine

		System.out.print("\n reverse List:");
		f = newList;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

	}
}
