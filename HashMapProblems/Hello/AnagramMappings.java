import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {
	public int[] anagramMappings(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], i);
		}
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.get(nums1[i]);
		}
		return nums1;
	}
}
