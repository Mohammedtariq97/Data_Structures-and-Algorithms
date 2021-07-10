
public class KthLargestElement {
	 public int findKthLargest(int[] nums, int k) {
	        int index = nums.length - k;
	        for(int i=0,j=i+1;i<nums.length && j<nums.length;){
		            if(nums[i] > nums[j]){
		                int temp = nums[i];
		                nums[i] = nums[j];
		                nums[j] = temp;
		                i=0;
		                j=i+1;
		            }else{
		                i++;
		                j++;
		            }
		        }
	        
	        return nums[index];
	    }
}
