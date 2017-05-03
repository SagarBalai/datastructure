package linkedList;

/**
 * Write a recursive function to print reverse of a Linked List
Given a linked list, print reverse of it using a recursive function. For example, if the given linked list is 1->2->3->4, then output should be 4->3->2->1.
 * @author sbalai
 *
 */
public class RecursiveReverseLinkedList {

	public void printReverse(Node node) {
		if (node == null) {
			return;
		}

		printReverse(node.next);
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) {
		Node first = new Node(2), head = first;

		for (int j = 3; j < 20; j = j + 4) {
			first.next = new Node(j);
			first = first.next;
		}

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}
		RecursiveReverseLinkedList revPrint = new RecursiveReverseLinkedList();
		System.out.print("\nReverse :");
		revPrint.printReverse(head);
		
	}

}
