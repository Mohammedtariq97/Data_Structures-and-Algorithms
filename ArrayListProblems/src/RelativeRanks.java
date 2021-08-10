
public class RelativeRanks {
	public String[] findRelativeRanks(int[] score) {
		int[] dup = new int[score.length];
		dup = score;
		Arrays.sort(dup);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < dup.length; i++) {
			map.put(dup[i], i + 1);
		}
		int val = 4;
		for (int i = 0; i < score.length; i++) {
			if (map.containsKey(score[i])) {
				if (i == 0) {
					score[i] = "Gold Medal";
				} else if (i == 1) {
					score[i] = "Silver Medal";
				} else if (i == 2) {
					score[i] = "Bronze Medal";
				} else {
					score[i] = val;
					val++;
				}

			}

		}

		return score;
	}
}
