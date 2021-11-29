public int[] findPeakGrid(int[][] mat) {
        int grt = 0;
        int[] res = new int[2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]>grt){
                    grt = Math.max(grt,mat[i][j]);
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

	
