
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 5, 6, 8, 9, 12 };
		int target = 6;
		int val = binaryFunction(arr, target);
		System.out.println(val);
	}

	private static int binaryFunction(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (target < arr[mid]) {
				right = mid - 1;
			} else if (target > arr[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
