class Solution {
    public String reversePrefix(String word, char ch) {
        String str = "";
        String lastStr = "";
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == ch){
                str = word.substring(0,i+1);
                lastStr = word.substring(i+1,word.length());
                break;
            }
        }
        if(str == ""){
            return word;
        }
        char[] s = str.toCharArray();
        int j=s.length-1;
        for(int i=0;i<(s.length/2);i++){
            if(i!=j){
               char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                
            }
            j--;
        }
        String res = String.valueOf(s) + lastStr;
        return res;
    }
}

	
