public int reverse(int x) {
        String str = "";
        if(x < 0){
            str = String.valueOf(Math.abs(x));
        }else{
            str = String.valueOf(x);
        }
        char[] cr = str.toCharArray();
        int j=cr.length -1;
        for(int i=0;i<cr.length;i++){
            if(i!=j && i<j){
                char temp = cr[i];
                cr[i] = cr[j];
                cr[j] = temp;
                j--;
            }
        }
        String s = "";
        if(x<0){
           s = "-"; 
        }
        for(int i=0;i<cr.length;i++){
            s = s+cr[i];
        }
        return Integer.parseInt(s);
    }
