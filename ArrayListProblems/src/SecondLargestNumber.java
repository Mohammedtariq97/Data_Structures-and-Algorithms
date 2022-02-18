public int secondHighest(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        String str = s.replaceAll("[a-z]","");
        String[] strArray = str.split("");
        int res = 0;
        for(int i=0;i<strArray.length;i++){
            int val = Integer.parseInt(strArray[i]);
            res = Math.max(val,res);
        }
        return res;
        
    }
