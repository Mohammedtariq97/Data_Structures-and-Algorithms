
public class LargestPerimeter {
	public int largestPerimeter(int[] nums) {
		for (int i = 0, j = 1; i < nums.length && j < nums.length;) {
			if (nums[i] > nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i = 0;
				j = i + 1;
			} else {
				i++;
				j++;
			}
		}
		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i] < nums[i - 1] + nums[i - 2]) {
				return nums[i] + nums[i - 1] + nums[i - 2];
			}
		}
		return 0;
	}
}
