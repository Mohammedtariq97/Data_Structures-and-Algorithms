import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {
	public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int s = 0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue() == n){
                s= m.getKey();
            }
        }
        return s;
    }
}
