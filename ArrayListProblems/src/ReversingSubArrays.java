import java.util.HashMap;

public class ReversingSubArrays {
	public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<target.length;i++){
            map.put(target[i],map.getOrDefault(target[i],0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            int count = map.getOrDefault(arr[i],0);
            if(!map.containsKey(arr[i])){
               return false; 
            }else{
                map.put(arr[i],count-1);
                if(count == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
