import java.util.ArrayList;
import java.util.List;

public class StrictlyIncreasing {
	public boolean canBeIncreasing(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        int j=1;
        for(int i=0;i<nums.length && j<nums.length;i++){
            if(nums[i]<nums[j]){
                list.add(nums[i]);
            }
            j++;
        }
        if(list.size() == 0){
            return false;
        }else{
            list.add(nums[nums.length-1]);
        }
        
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
