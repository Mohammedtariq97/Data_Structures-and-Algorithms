
public class SumOfDigitsInTheMinimumNumber {
	 public int sumOfDigits(int[] nums) {
	        for(int i=0,j = i+1; i<nums.length && j<nums.length; ){
	            if(nums[i] > nums[j]){
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                i = 0;
	                j=i+1;
	            }else{
	                i++;
	                j++;
	            }
	        }
	        
	        int min = nums[0];
	        int sum =0;
	        
	        while(min > 0){
	            sum = sum + min%10;
	            min = min/10;
	        }
	        
	        if(sum%2 == 0){
	            return 1;
	        }else{
	            return 0;
	        }
	    }
}
