import java.util.HashMap;
import java.util.Map;

public class FindLucky {
	public int findLucky(int[] arr) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue() == m.getKey()){
                res = Math.max(res,m.getKey());
            }
        }
        if(res == 0){
            return -1;
        }else{
            return res;
        }
        
    }
}
