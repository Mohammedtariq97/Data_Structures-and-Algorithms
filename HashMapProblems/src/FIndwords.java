public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"qwertyuiop");
        map.put(2,"asdfghjkl");
        map.put(3,"zxcvbnm");
        for(int i=0;i<words.length;i++){
            int count = 0;
            String s = words[i].toLowerCase();
            for(char c:s){
                if(!map.containsValue(c)){
                    count++;
                }
            }
        }
    }
