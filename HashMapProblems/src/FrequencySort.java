public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> chr = new ArrayList<>(map.keySet());
        Collections.sort(chr, (a,b) -> map.get(b)- map.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : chr) {
            int copies = map.get(c);
            for (int i = 0; i < copies; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
