import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,3,4};
		int[] index = new int[] {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums,index)));

	}

	 public static int[] createTargetArray(int[] nums, int[] index) {
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            al.add(index[i],nums[i]);
	        }
	        int[] arr = new int[nums.length];
	        for(int i=0;i<al.size();i++)
	        {
	            arr[i]=al.get(i);
	        }
	        return arr;
	    }
}
