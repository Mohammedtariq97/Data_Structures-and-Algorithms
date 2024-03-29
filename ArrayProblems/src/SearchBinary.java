 public int search(int[] nums, int target) {
        //Binary search
        int l=0; 
        int r = nums.length -1;
        while(l<=r){
            int m = l+(r-1) /2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m]<target){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return -1;
    }

	
