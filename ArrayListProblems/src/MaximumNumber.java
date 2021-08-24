
public class MaximumNumber {
	 public int thirdMax(int[] nums) {
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]<nums[j]){
	                    int temp = nums[i];
	                    nums[i] = nums[j];
	                    nums[j] = temp;
	                }
	            }
	        }
	        int j= 1;
	        for(int i=0;i<nums.length-1;i++){
	            if(nums[i] != nums[i+1]){
	                nums[j]= nums[i+1];
	                j++;
	            }
	        }
	        if(nums.length == 2){
	            return Math.max(nums[0],nums[1]);
	        }else if(nums.length == 1){
	            return nums[0];
	        }else return nums[2];
	        
	    }
}
