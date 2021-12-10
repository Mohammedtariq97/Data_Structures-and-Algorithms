class Solution {
    int index1 = 0;
    int index2 = 0;
    
    public int maxArea(int[] height) {
        int[] dup = new int[height.length];
        dup = height;
        Arrays.sort(dup);
        return dup[height.length-1];
    }
    
    public int returnMax(int[] height,int max){
        int resMax = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]!=max){
                resMax = Math.max(height[i],resMax);
                if(max == -1 && height[i] == resMax){
                    index1 = i;
                }else{ 
                    if(height[i] == resMax){
                        index2 = i;
                    } 
                }
            }
        }
        return resMax;
    }
}

	
