import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequency {
	  public void frequencySort(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	        
	        for(int i=0;i<nums.length;i++){
	           if(!map.containsKey(nums[i])){
	               map.put(nums[i],1);
	           }else{
	               map.put(nums[i],map.get(nums[i]) +1);
	           }
	        }
	    
	        int k=0;
	        
	        for(Map.Entry<Integer,Integer> e : map.entrySet()){
	            int val = e.getKey();
	            int freq = e.getValue();
	            for(int i=0;i<freq;i++){
	                nums[k] = val;
	                k++;
	            }
	        }
	    }
}
