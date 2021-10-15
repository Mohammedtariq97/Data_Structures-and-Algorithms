public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!magazine.contains(String.valueOf(c))){
                return false;
            }
            int val = magazine.indexOf(c);
            StringBuilder strb = new StringBuilder(magazine);
            strb.setCharAt(val,'\0');
            magazine = strb.toString();
        }
        return true;
    }

	
