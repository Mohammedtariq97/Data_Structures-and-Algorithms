import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {

	public static void main(String[] args) {
		
		System.out.println(firstUniqChar1("loveleetcode"));
	}

	 public static int firstUniqChar(String s) {
	        
	        Map<Character, Integer> map = new HashMap<>();
	        
	        for(int i=0;i<s.length();i++){
	            if(!map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),i);
	            }else {
	            	map.remove(s.charAt(i));
	            }
	        }
	        
	        for(int i=0;i<s.length();i++){
	           if(map.containsKey(s.charAt(i))) {
	        	   return map.get(s.charAt(i));
	           }   
	        }
	      
	        return -1;
	    }
	 
	 public static int firstUniqChar1(String s) {
	        
	        Map<Character, Integer> map = new HashMap<>();
	        
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            map.put(c,map.getOrDefault(c, 0)+1);
	        }
	        //getOrDefault will get the value for specified key, if not means will map default value
	        
	        for(int i=0;i<s.length();i++){
		           if(map.get(s.charAt(i)) == 1) {
		        	   return i;
		           }    
		        }
	        
	        return -1;
	    }
	 
}
