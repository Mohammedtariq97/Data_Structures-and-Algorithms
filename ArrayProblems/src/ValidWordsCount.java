public int countValidWords(String sentence) {
        int count = 0;
        String regex1 = "[^0-9]+";
        String regex2 = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String[] str = sentence.trim().split("\\s+");
        for(String s:str){
            if(s.matches(regex1) && s.matches(regex2)){
                count++;
            }
        }
        return count;
    }

	
