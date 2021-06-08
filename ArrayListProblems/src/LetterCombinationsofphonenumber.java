import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofphonenumber {
	 public List<String> letterCombinations(String digits) {
	        HashMap<Integer,String> map = new HashMap<>();
	        String alpha = "abcdefghijklmnopqrstuvwxyz";
	        int j=3;
	        int k = 0;
	        for(int i=2;i<=9;i++){
	            map.put(i,alpha.substring(k,j));
	            if(i == 6 || i== 8){
	                j=j+4;
	            }else{
	                j = j+3;  
	            }
	            if(i == 7 || i == 9){
	                k=k+4;
	            }else{
	                k = k+3;
	            }  
	        }
			return null;
	    }
}
