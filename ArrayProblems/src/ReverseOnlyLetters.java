
public class ReverseOnlyLetters {
	public String reverseOnlyLetters(String s) {
        int mid = s.length()/2;
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        int j= s.length()-1;
        for(int i=0;i<mid;){
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j]) && i!=j){
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
            }else if(!Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                i++;
                j--;
            }else if(!Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                i++;
            }else if(Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                j--;
            }
            
        }
        return String.valueOf(ch);
    }
}
