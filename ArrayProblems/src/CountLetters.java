public int countLetters(String s) {
        int tot = 1; int cnt = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }else{
                cnt = 1;
            }
            tot = tot + cnt;
        }
        return tot;
    }

	
