public class MissingNumber {
	 public int missingNumber(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int min = 0;
	        int max = 0;
	        for(int i=0;i<nums.length;i++){
	            min = Math.min(min,nums[i]);
	            max = Math.max(max,nums[i]);
	        }
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],i);
	        }
	        for(int i=min;i<=max;i++){
	            if(!map.containsKey(i)){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
}
