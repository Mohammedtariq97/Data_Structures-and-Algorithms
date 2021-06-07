
public class PalindromeNUmber {
	 public boolean isPalindrome(int x) {
	        int len = (int) (Math.log10(x) + 1);
	        int[] nums = new int[len];
	        int i =0;
	        while(x > 0){
	           nums[i] = x%10;
	            x= x/10;
	            i++;
	        }
	        int j=nums.length-1;;
	        for(int k=0;k<nums.length;k++){
	            if(nums[k] != nums[j] && k!=j){
	                return false;
	            }
	            j--;
	        }
	        return true;
	    }
}
