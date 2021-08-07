import java.util.ArrayList;
import java.util.List;

public class DecompressList {
	public int[] decompressRLElist(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i = i + 2) {
			int freq = nums[i];
			int val = nums[i + 1];
			while (freq > 0) {
				list.add(val);
				freq--;
			}
		}
		return list.stream().mapToInt(i -> i).toArray();

	}
}
