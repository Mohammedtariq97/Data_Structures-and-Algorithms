public int countWords(String[] words1, String[] words2) {
        int count=0;
        Map map = new HashMap<String,Integer>();
        for(int i=0;i<words1.length;i++){
            map.put(words1[i],map.getOrDefault(0,1));
        }
        for(int i=0;i<words2.length;i++){
            if(map.containsKey(words2[i])){
                count++;
            }
        }
        return count;
    }
