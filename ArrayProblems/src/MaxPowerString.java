public int maxPower(String s) {
        int count = 1;
        int val = 0;
        String[] str = s.split("");
        for(int i=0;i<str.length-1;i++){
            if(str[i].equals(str[i+1])){
                count++;
                val = Math.max(count,val);
            }else{
                count = 1;
            }
        }
        if(val == 0){
            return 1;
        }
        return val;
}

	
