public int lengthOfLongestSubstring(String s) {
        String ans ="";
        String[] str = s.split("");
        if(str.length!=0){
           ans = str[0]; 
        }
        for(int i=0;i<str.length-1;i++){
            if(!ans.contains(str[i+1])){
                if(str[i]!=str[i+1]){
                    ans = ans + str[i+1];
                }
            }
        }
        return ans.length();
    }
	
