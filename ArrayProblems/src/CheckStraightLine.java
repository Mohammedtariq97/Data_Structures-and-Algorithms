public boolean checkStraightLine(int[][] coordinates) {
        int diff = 0;
        int val =0;
        for(int i=0;i<coordinates.length-1;i++){
            int val1 = coordinates[i][0] + coordinates[i][1];
            int val2 = coordinates[i+1][0] + coordinates[i+1][1];
            val = val2- val1;
            if(diff!=val && diff!=0){
                return false;
            }else{
                diff = val;
            } 
        }
        return true;
    }

	
