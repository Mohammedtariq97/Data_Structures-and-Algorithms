
public class ReplaceDigits {

	public String replaceDigits(String s) {
        char[] c = s.toCharArray();
        for(int i=0;i<c.length-1 && i+1<c.length;i = i+2){
            if(c[i] >= 'a' && c[i] <= 'z' && !Character.isAlphabetic(c[i+1]) ){
                int x = Character.getNumericValue (c[i+1]);
                c[i+1] = shift(c[i],x);
            }
        }
        return String.valueOf(c);
    }
    
    public char shift(char c,int x){
        return (char) (c+x);
    }

}
