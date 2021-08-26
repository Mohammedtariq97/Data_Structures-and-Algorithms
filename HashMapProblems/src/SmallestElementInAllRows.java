public int smallestCommonElement(int[][] mat) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(mat[i][j],map.getOrDefault(mat[i][j],0)+1);
            }
        }
        int val = 0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue() == mat.length){
                
                if(val == 0){
                    val = m.getKey();
                }else{
                    val = Math.min(val,m.getKey());
                }
            }
        }
        return val;
    }
