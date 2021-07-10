import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	 public List<Integer> majorityElement(int[] nums) {
	        
	        List<Integer> list = new ArrayList<>();
	        
	        Map<Integer,Integer> map1 = new HashMap<>();
	        for(int n:nums){
	            map1.put(n,map1.getOrDefault(n,0)+1);
	        }
	        int len = nums.length /3;
	        
	        for(Map.Entry<Integer,Integer> m : map1.entrySet()){
	            if(m.getValue() > len){
	                list.add(m.getKey()) ;
	            }
	        }
	        return list;
	    }
}
