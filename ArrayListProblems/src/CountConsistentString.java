
public class CountConsistentString {

	public static void main(String[] args) {
		
		String[] words = new String[] {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings("ab",words));
		
	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
        
        int count =0;
        for(int i=0;i<words.length;i++){
           for(char c: words[i].toCharArray()){
               if(allowed.indexOf(c)== -1){
                   count--;
                   break;
               }
           }
            count++;
        }
        return count;
        
    }

}
