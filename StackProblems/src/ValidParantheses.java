import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
	 public boolean isValid(String s) {
	        HashMap<Character,Character> map = new HashMap<>();
	        map.put(')','(');
	        map.put(']','[');
	        map.put('}','{');
	        char topElement = 'a';
	        Stack<Character> stack = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            if(map.containsKey(c)){
	                if(stack.empty()){
	                    topElement = '#';
	                }else{
	                    topElement = stack.pop();
	                }
	                if(topElement != map.get(c)){
	                    return false;
	                }
	            }else{
	                stack.push(c);
	            }
	        }
	        return stack.isEmpty();
	    }
}
