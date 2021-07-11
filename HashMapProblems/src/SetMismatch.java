import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count = i;
            }else{
                map.put(nums[i],i);
            }
        }        
        nums[count] = nums[count] + 1;
        return new int[]{nums[count-1],nums[count]};
    }
}
