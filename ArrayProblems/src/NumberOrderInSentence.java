public boolean areNumbersAscending(String s) {
        s = s.replaceAll("[a-zA-z\\s]","");
        s = s.trim();
        String[] str = s.split("");
        for(int i=0;i<str.length-1;i++){
            int val1 = Integer.parseInt(str[i]);
            int val2 = Integer.parseInt(str[i+1]);
            if(val1 >= val2){
                return false;
            }
        }
        return true;
    }

	
