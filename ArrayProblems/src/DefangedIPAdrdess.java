
public class DefangedIPAdrdess {
	public static void main(String[] args) {
		String address = "1.1.1.1.1";
		StringBuilder sb = new StringBuilder();
	    for (char c : address.toCharArray()) {
	        sb.append(c == '.' ? "[.]" : c);
	    }
	    System.out.println(defangIPaddr(address));
	}
	
	public static String defangIPaddr(String address) {
        String s = address.replaceAll("\\.","[.]");
        return s;
    }
	
}
