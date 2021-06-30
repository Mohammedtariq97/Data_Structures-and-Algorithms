
public class CreateTargetArray {

	public static void main(String[] args) {
		

	}

	 public int[] createTargetArray(int[] nums, int[] index) {
	        int[] res = new int[nums.length];
	        int val = -1;
	        for(int i=0;i<index.length;i++){
	            res[index[i]] = nums[i];
	                
	        }
	        return res;
	    }
}
