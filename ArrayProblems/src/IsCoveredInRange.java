class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean leftPresent = false;
        boolean rightPresent = false;
        for(int i=0,j=0;i<ranges.length;i++){
            if(left >= ranges[i][j] && left <= ranges[i][j+1]){
                    leftPresent = true;
            }
            if(right >= ranges[i][j] && right <= ranges[i][j+1]){
                    rightPresent = true;
            } 
        }
        return leftPresent&&rightPresent;
    }
}