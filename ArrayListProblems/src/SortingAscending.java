import java.util.Arrays;

public class SortingAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,3,1,2};
		System.out.println(Arrays.toString(sortArray(nums)));
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

}
