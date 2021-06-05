import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        //Brute force solution
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0 ; j<nums.length;j++){
                if(i!=j && (nums[i]+nums[j] == target)){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
	
	//Hashmap solution
	
	public int[] twoSum2(int[] nums, int target) {
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
	    for(int i=0;i<nums.length;i++){
	        hashmap.put(i,nums[i]);
	    }
	    
	    for(int i=0;i<nums.length;i++){
	        
	    }
	    
	    
	}
	
	
}
