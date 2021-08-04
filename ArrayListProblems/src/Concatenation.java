
public class Concatenation {
	public int[] getConcatenation(int[] nums) {
		int[] res = new int[nums.length + nums.length];
		int j = 0;
		int i = 0;
		int count = 0;
		for (; i < nums.length;) {
			res[j] = nums[i];
			j++;
			i++;
			if (i >= nums.length) {
				count++;
				i = 0;
			}
			if (count == 2) {
				break;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			res[j] = nums[i];
			j++;
		}
		for (int i = 0; i < nums.length; i++) {
			res[j] = nums[i];
			j++;
		}

		return res;
	}
}
