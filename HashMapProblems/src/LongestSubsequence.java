public List<Integer> longestCommonSubsequence(int[][] arrays) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays[i].length;j++){
                int val = arrays[i][j];
                map.put(val,map.getOrDefault(val,0)+1); 
            }
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue() == arrays.length){
                list.add(m.getKey());
            }
        }
        return list;
    }