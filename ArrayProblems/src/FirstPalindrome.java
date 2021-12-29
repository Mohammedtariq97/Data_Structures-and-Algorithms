public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i]) == true){
                return words[i];
            }
        }
        return "";
    }
    
    public boolean isPalindrome(String s){
        char[] c = s.toCharArray();
        int j=c.length - 1;
        for(int i=0;i<c.length/2;i++){
            if(c[i]!=c[j]){
                return false;
            }else{
                j--;
            }
        }
        return true;
    }

	
