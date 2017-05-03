package linkedList;
/**
 * @author sbalai Given a sorted array which has been rotated n number of times.
 *         Find the value of n, provided 0<n<length.
 */
public class SortedArrRotation {
	public int findRotations(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return i + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 11, 12, 13, 10, 4, 5, 6, 7 };
		SortedArrRotation rotation = new SortedArrRotation();
		System.out.println(rotation.findRotations(a));
	}
}
