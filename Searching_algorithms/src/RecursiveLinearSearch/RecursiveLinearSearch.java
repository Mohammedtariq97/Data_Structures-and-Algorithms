package algo.recursiveLinearSearch;

public class App {
	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] { 1, 2, 3, 4, 6, 8, 12, 18 }, 0, 3));
	}

	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if (i > a.length-1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else
			return recursiveLinearSearch(a, i + 1, x);
	}
}
