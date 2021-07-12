
public class MaximumProduct {
	public int maximumProduct(int[] nums) {

		for (int i = 0, j = i + 1; i < nums.length && j < nums.length;) {
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

		/*Since after sorting there will be two possibilities,
		 * Last three numbers
		 * If the numbers are negative, first two and last number
		*/
		return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
				nums[0] * nums[1] * nums[nums.length - 1]);
	}
}
