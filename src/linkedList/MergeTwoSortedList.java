package linkedList;

/**
 * Merge two sorted link list and return final linked list.
 * @author sbalai
 *
 */
public class MergeTwoSortedList {
	public static void main(String[] args) {
		Node first = new Node(1), firstHead = first, second = new Node(5), secHead = second;

		for (int i = 3; i < 30; i = i + 4) {
			first.next = new Node(i);
			first = first.next;
		}

		for (int i = 9; i < 25; i = i + 4) {
			second.next = new Node(i);
			second = second.next;
		}

		System.out.print("\n First List:");
		Node f = firstHead;
		while (f != null) {
			System.out.print(f.data + " ");
			f= f.next;
		}

		System.out.print("\n Second List:");
		Node sec = secHead;
		while (sec != null) {
			System.out.print(sec.data + " ");
			sec= sec.next;
		}

		MergeTwoSortedList merge = new MergeTwoSortedList();
		Node fHead = firstHead, sHead = secHead;
		Node mergeData = merge.merge(fHead, sHead);

		System.out.print("\nMerged List:");
		while (mergeData != null) {
			System.out.print(mergeData.data + " ");
			mergeData = mergeData.next;
		}
	}

	public Node merge(Node firstHead, Node secHead) {
		Node result = null, resultHead = null;
		while (firstHead != null && secHead != null) {
			int data;
			if (firstHead.data < secHead.data) {
				data = firstHead.data;
				firstHead = firstHead.next;
			} else {
				data = secHead.data;
				secHead = secHead.next;
			}

			if (result == null) {
				result = new Node(data);
				resultHead = result;
			} else {
				result.next = new Node(data);
				result = result.next;
			}
		}

		while (firstHead != null) {
			result.next = new Node(firstHead.data);
			result = result.next;
			firstHead = firstHead.next;
		}

		while (secHead != null) {
			result.next = new Node(secHead.data);
			result = result.next;
			secHead = secHead.next;
		}
		return resultHead;
	}
}
