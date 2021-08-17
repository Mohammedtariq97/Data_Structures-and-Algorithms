import java.util.HashMap;

public class UniqueNoOfOccurences {
public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        for(int n:map.values()){
            if(map1.containsKey(n)){
                return false;
            }else{
                map1.put(n,0);
            }
        }
        return true;
    }
}

