import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatches {

	public static void main(String[] args) {
		List<String> arr1 = new ArrayList<>(Arrays.asList("phone","blue","pixel"));
		List<String> arr2 = new ArrayList<>(Arrays.asList("computer","silver","lenovo"));
		List<String> arr3 = new ArrayList<>(Arrays.asList("phone","gold","iphone"));
		
		List<List<String>> list = new ArrayList<>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		
		int result = countMatches(list,"color","silver");
		System.out.println(result);
	}

	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        int count =0;
	        for(int i=0;i< items.size();i++){
	            for(int j=0;j<items.get(i).size();j++){
	                if(ruleKey == "type" && j == 0){
	                    if(ruleValue == items.get(i).get(j)){
	                        count++;
	                    }
	                }
	                if(ruleKey == "color" && j == 1){
	                    if(ruleValue == items.get(i).get(j)){
	                        count++;
	                    }
	                }
	                if(ruleKey == "name" && j == 2){
	                    if(ruleValue == items.get(i).get(j)){
	                        count++;
	                    }
	                }
	            }
	            
	        }
	        return count;
	    }
}
