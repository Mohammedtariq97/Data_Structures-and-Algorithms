import java.util.ArrayList;
import java.util.List;

public class BuildingStackArray {
	public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<String>();
        int j =0;
        for(int i=1;i<=n;i++){
            if(target[j] == i){
                list.add("Push");
                j++;
                if(j>=target.length){
                   break; 
                }
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
