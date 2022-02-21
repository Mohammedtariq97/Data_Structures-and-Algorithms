import java.util.HashMap;
import java.util.Map;

public class CountingElements {
	public int countElements(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] + 1)) {
				sum++;
			}
		}
		return sum;
	}
}
