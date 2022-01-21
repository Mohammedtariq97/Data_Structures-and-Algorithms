
public class Palindrome {
	public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.replaceAll("\\s","");
        s= s.toLowerCase();
        int len = s.length();
        char[] charArray = new char[s.length()];
        charArray = s.toCharArray();
        int j = len-1;
        for(int i=0;i<len;i++){
            if(charArray[i] != charArray[j] && i != j){
                    return false;
            }  
            j--;
        }
        return true;
    }
}
