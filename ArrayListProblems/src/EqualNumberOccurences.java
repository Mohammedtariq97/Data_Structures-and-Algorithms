import java.util.HashMap;
import java.util.Map;

public class EqualNumberOccurences {
	public boolean areOccurrencesEqual(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int res = 0;
		int i = 0;
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (i == 0) {
				res = m.getValue();
			} else {
				if (m.getValue() != res) {
					return false;
				}
			}
			i++;

		}
		return true;

	}
}
