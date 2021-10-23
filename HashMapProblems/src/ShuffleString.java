
public class ShuffleString {
	 public String restoreString(String s, int[] indices) {
	        
	        char[] charArray = new char[s.length()];
	        
	        for(int i=0;i<indices.length;i++){
	            charArray[indices[i]] = s.charAt(i);
	        }
	        
	        String s1 = "";
	        for(int i=0;i<charArray.length;i++){
	            s1 = s1 + charArray[i];
	        }
	        
	        return s1;
	    }
}
