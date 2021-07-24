import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindRestaurant {
	public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                map.put(list2[i],map.get(list2[i])+i);
            }else{
                map.put(list2[i],i);
            }
        }
        String s = "";
        int val = 0;
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue() > val){
                val = m.getValue();
                s = m.getKey();
            }
        }
        return new String[] {s};
    }
}
