import java.util.Arrays;

public class SortingAscending {

	public static void main(String[] args) {
		int[] nums = new int[] {5,3,1,2,4,8,6};
		System.out.println(Arrays.toString(sortArrayOn(nums)));
	}
	
	public static int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
	
	public static int[] sortArrayOn(int[] nums) {
		
		for(int i=0,j =i+1; i<nums.length && j<nums.length;) {
			if(nums[i] > nums[j]) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i=0;
				j=i+1;
			}else {
				i++;
				j++;
			}
		}
		return nums;
	}

}
