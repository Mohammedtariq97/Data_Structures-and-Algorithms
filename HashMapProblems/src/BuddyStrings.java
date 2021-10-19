public boolean buddyStrings(String s, String goal) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,i);
        }
        for(int i=0;i<goal.length();i++){
            char c = goal.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }
        }
        return true;
    }
