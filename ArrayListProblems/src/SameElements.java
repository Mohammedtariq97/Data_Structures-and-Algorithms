import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameElements {
	public List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int n : nums) {
			if (map.containsKey(n)) {
				list.add(n);
			} else {
				map.put(n, 0);
			}
		}
		return list;
	}
}
