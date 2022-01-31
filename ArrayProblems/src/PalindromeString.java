 public Boolean longestPalindrome(String s) {
        int j= s.length() - 1;
        for(int i=0;i<s.length()/2;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1!=c2){
                return false;
            }
            j--;
        }
        return true;
    }
