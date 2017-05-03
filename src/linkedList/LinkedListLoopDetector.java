package linkedList;

public class LinkedListLoopDetector {

	public boolean isLoopInList(Node node) {
		boolean isLoop = false;
		Node first = node;
		Node second = node.next.next;
		while (first != null && second != null) {
			if (first == second) {
				isLoop = true;
				break;
			}
			first = first.next;
			if (second.next != null) {
				second = second.next.next;
			} else {
				second = null;
			}
		}

		return isLoop;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = head;
		Node second = new Node(2);
		first.next = second;
		first = first.next;

		for (int i = 3; i <= 7; i++) {
			first.next = new Node(i);
			first = first.next;
		}
		first.next = second;

		LinkedListLoopDetector loopDetector = new LinkedListLoopDetector();
		System.out.println(loopDetector.isLoopInList(head));
	}

}
