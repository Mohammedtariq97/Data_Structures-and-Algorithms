 public String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(i) == 'a' || str[i].charAt(i) == 'e' || str[i].charAt(i) == 'i' || str[i].charAt(i) == 'o' || str[i].charAt(i) == 'u'){
                str[i] = str[i] + "ma";
            }else{
                String s = str[i];
                s = s + "ma";
                str[i] = s.substring(1,s.length()-1);
            }
        }
        return Arrays.toString(str);
    }

	
