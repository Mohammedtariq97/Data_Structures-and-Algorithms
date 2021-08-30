
public class SortingOnePase {
	public int Sorting(int[] nums) {
        	for(int i=0,j=i+1;i<nums.length&&j<nums.length;){
        		if(nums[i]>nums[j]){
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
    	}
}
