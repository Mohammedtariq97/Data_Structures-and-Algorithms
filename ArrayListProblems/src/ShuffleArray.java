import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {

		int[] nums = new int[] {2,5,1,3,4,7};
		nums = shuffle(nums,3);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];
		int j = 0;
		for (int i = 0; i < n; i++) {

			result[j] = nums[i];
			j = j + 2;
		}
		int k = 1;
		for (int i = n; i < nums.length; i++) {
			result[k] = nums[i];
			k = k + 2;
		}
		return result;
	}

}
