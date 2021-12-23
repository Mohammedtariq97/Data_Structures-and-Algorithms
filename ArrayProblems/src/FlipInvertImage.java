public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int k = image[i].length-1;
            for(int j=0;j<image[i].length;j++){
                if(j<k){
                    int temp = image[i][j];
                    image[i][j] = image[i][k];
                    image[i][k] = temp;
                    k--;
                }
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
	
