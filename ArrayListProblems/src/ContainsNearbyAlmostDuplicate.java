
public class ContainsNearbyAlmostDuplicate {
	 public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	        
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if(i!=j){
	                    int cond1 = Math.abs(nums[i]-nums[j]);
	                    int cond2 = Math.abs(i-j);
	                    if(cond1 <= t && cond2 <= k){
	                        return true;
	                    }
	                }
	                
	            }
	        }
	        return false;
	    }
}
