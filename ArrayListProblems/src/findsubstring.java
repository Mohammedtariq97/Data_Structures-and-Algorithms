public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){ 
                count++;
            }
            if(word.indexOf(patterns[i]) != -1){
                count++;
            }
        }
        return count;
    }


