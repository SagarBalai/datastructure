package linkedList;

public class AddTwoNumbersUsingLinkedListwithRevers {
	
	/**
	 * Reverse linked list.
	 * 
	 * @param node
	 * @return
	 */
	public Node reverse(Node node) {
		Node a = node;
		Node result = null;
		while (a != null) {
			Node temp = result;
			result = new Node(a.data);
			result.next = temp;
			a = a.next;
		}
		return result;
	}

	/**
	 * Add two linked list.
	 * @param first
	 * @param second
	 * @return
	 */
	public Node add(Node first, Node second) {
		Node rFirst = reverse(first);
		Node rSecond = reverse(second);
		Node rResult = null;
		Node rResHead = null;
		int fromPrev = 0;
		while (rFirst != null && rSecond != null) {
			int v1 = rFirst.data;
			int v2 = rSecond.data;
			int sum = v1 + v2 + fromPrev;
			fromPrev = sum / 10;
			if (rResult == null) {
				rResult = new Node(sum % 10);
				rResHead = rResult;
			} else {
				rResult.next = new Node(sum % 10);
				rResult = rResult.next;
			}
			rFirst = rFirst.next;
			rSecond = rSecond.next;
		}

		while (rFirst != null) {
			int val = rFirst.data + fromPrev;
			fromPrev = val / 10;

			rResult.next = new Node(val % 10);
			rResult = rResult.next;
			rFirst = rFirst.next;
		}

		while (rSecond != null) {
			int val = rSecond.data + fromPrev;

			rResult.next = new Node(val % 10);
			rResult = rResult.next;
			rSecond = rSecond.next;
		}

		if (fromPrev != 0) {
			rResult.next = new Node(fromPrev);
			rResult = rResult.next;
		}
		Node result = reverse(rResHead);
		return result;
	}

	public static void main(String[] args) {
		AddTwoNumbersUsingLinkedListwithRevers add = new AddTwoNumbersUsingLinkedListwithRevers();
		StringBuilder sb = new StringBuilder("1");
		Node first = new Node(1);
		Node firstHead = first;
		for (int i = 2; i < 10; i++) {
			sb.append(i);
			first.next = new Node(i);
			first = first.next;
		}
		sb.append("+2");
		Node sec = new Node(2);
		Node secHead = sec;
		for (int i = 3; i < 10; i++) {
			sb.append(i);
			sec.next = new Node(i);
			sec = sec.next;
		}

		sb.append("=");
		Node res = add.add(firstHead, secHead);
		while (res != null) {
			sb.append(res.data);
			res = res.next;
		}

		System.out.println(sb.toString());
	}
}
