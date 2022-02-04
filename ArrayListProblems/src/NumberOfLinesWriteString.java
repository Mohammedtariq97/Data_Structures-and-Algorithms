public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int count = 0;
        int index = 0;
        int val = 0;
        for(int i=0;i<s.length();i++){
            if(sum >= 100){
                sum = 0;
                count++;
                index = i;
                sum = sum + widths[i];
            }else{
                sum = sum + widths[i];
            }
        }
        if(sum<100){
            count++;
        }
        for(int i=index;i<widths.length;i++){
            val = val + widths[i];
        }
        return new int[]{count,val};
    }

	
