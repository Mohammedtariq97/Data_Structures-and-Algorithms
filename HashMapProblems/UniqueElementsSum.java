import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElementsSum {
	class Solution {
		public int sumOfUnique(int[] nums) {
			List<Integer> list = new ArrayList<Integer>();

			int same = 0;
			int diff = 0;
			int resultSum = 0;
		
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j] && i != j) {
						same++;
					} else {
						diff++;
					}
				}
				if (same == 0) {
					list.add(nums[i]);
				} else {
					same = 0;
					diff = 0;
				}
			}

			for (int i = 0; i < list.size(); i++) {
				resultSum = resultSum + list.get(i);
			}

			return resultSum;
		}
	}
	
	//Hashmap implementation
	public int sumOfUnique(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int resultSum =0;
       
        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(nums[i])){
                map.put(nums[i],i);
            }else{
                map.remove(nums[i]);
            }
        }
        
         for (Map.Entry<Integer, Integer> e : map.entrySet()){
             resultSum = resultSum +  e.getKey();
         }
        
        return resultSum;
    }
}
