import java.util.HashMap;

public class StringDifference {
	
	public char findTheDifference(String s, String t) {
        char extraChar = '\0';
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            int count = map.getOrDefault(c,0);
            if(count == 0){
                extraChar = c;
                break;
            }else{
                map.put(c,count-1);
            }
        }
        
        return extraChar;
    }

}
