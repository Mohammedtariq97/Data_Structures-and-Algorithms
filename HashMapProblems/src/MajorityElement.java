import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Map.Entry<Integer, Integer> majorityEntry = null;
        
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if (majorityEntry == null || m.getValue() > majorityEntry.getValue()) {
                majorityEntry = m;
            }
        }
        
        return majorityEntry.getKey();
    }
}
