import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if((candies[i] + extraCandies) < candies.length){
                list.add(i,false);
            }else{
                list.add(i,true);
            }
        }
        return list;
    }
}
