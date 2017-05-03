package linkedList;

/**
 * Sort the linked list using merge sort.
 * @author sbalai
 *
 */
public class MergeSort {

	public Node mergeSort(Node list) {
		Node head = list;
		Node firstHalf, secHalf;

		if (head == null || head.next == null) {
			return head;
		}
		MergeResult res = splitListFromMiddle(list);
		firstHalf = res.first;
		secHalf = res.sec;

		Node first = mergeSort(firstHalf);
		Node second = mergeSort(secHalf);

		Node result = sortedMerge(first, second);
		return result;
	}

	public Node sortedMerge(Node first, Node second) {
		Node result = null;
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}

		if (first.data < second.data) {
			result = first;
			result.next = sortedMerge(first.next, second);
		} else {
			result = second;
			result.next = sortedMerge(first, second.next);
		}
		return result;
	}

	public MergeResult splitListFromMiddle(Node list) {
		Node first = list, second = null;
		if (list == null || list.next == null) {
			second = null;
		} else {

			Node fast = list.next, slow = list;
			while (fast != null) {
				fast = fast.next;
				if (fast != null && fast.next != null) {
					slow = slow.next;
					fast = fast.next;
				}
			}
			second = slow.next;
			slow.next = null;
		}

		return new MergeResult(first, second);
	}

	public static void main(String[] args) {
		Node first = new Node(9), head = first;

		for (int j = 8; j >= 2; j = j - 1) {
			first.next = new Node(j);
			first = first.next;
		}

		System.out.print("\nList:");
		Node f = head;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		MergeSort sort = new MergeSort();
		Node result = sort.mergeSort(head);// splitListFromMiddle(head);
		// Node firstHalf = result.first, secHalf = result.sec;

		System.out.print("\nResult:");
		f = result;
		while (f != null) {
			System.out.print(f.data + " ");
			f = f.next;
		}

		// System.out.print("\nSecond:");
		// f = secHalf;
		// while (f != null) {
		// System.out.print(f.data + " ");
		// f = f.next;
		// }
		//
	}

	class MergeResult {
		public Node first, sec;

		public MergeResult(Node f, Node sec) {
			first = f;
			this.sec = sec;
		}

	}

}
