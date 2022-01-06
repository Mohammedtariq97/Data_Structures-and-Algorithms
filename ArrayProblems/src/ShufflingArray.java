public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k= 0;
        for(int i=0,j=n;i<n&&j<nums.length;i++,j++){
            arr[k] = nums[i];
            arr[k+1] = nums[j];
            k = k+2;
        }
        return arr;
    }

	
