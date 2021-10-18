public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=1;i<order.length();i++){
            char c = order.charAt(i);
            map.put(c,i);
        }
        int count = 0;
        for(int i=0;i<words.length;i++){
            char c = words[i].charAt(0);
            if(map.containsKey(c)){
                if(count <= map.get(c)){
                    count = map.get(c);
                }else{
                    return false;
                }
            }
        }
    }
