public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i=0;i<strs[0].length();i++){ //traversing column
            for(int j=1;j<strs.length;j++){  // traversing rows
                char c1 = strs[j-1].charAt(i);
                char c2 = strs[j].charAt(i);
                if( c1 > c2){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

	
