public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] sArray = brokenLetters.split("");
        String[] arr = text.split(" ");
        for(int i=0;i<arr.length;i++){
            boolean isThere = false;
            for(int j=0;j<sArray.length;j++){
                if(!arr[i].contains(sArray[j])){
                    isThere = true;
                }else{
                    isThere = false;
                }
            }
            if(isThere == true){
                count++;
            }
        }
        return count;
    }

	
