public String removeVowels(String s) {
        //Inbuilt function
        s = s.replaceAll("[aeiou]","");
        return s;
        //Looping every character
        String resString = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != 'a' && c!= 'e' && c!= 'i' && c!='o' && c!= 'u'){
                resString = resString + String.valueOf(c);
            }
        }
        return resString;
    }
