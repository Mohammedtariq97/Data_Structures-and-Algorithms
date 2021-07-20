
public class TruncateSentence {
	 public String truncateSentence(String s, int k) {
	        String[] str = s.split(" ");
	        String s1 = "";
	        for(int i=0;i<str.length && i<k;i++){
	            if(s1 == ""){
	              s1 = s1 + str[i];  
	            }else{
	               s1 = s1 + " " + str[i]; 
	            }
	            
	        }
	        return s1;
	    }
}
