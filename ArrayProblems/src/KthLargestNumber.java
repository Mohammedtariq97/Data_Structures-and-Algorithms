public String kthLargestNumber(String[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        for(int i=0,j=i+1;i<arr.length&&j<arr.length;){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i=0;
                j=i+1;
            }else{
                i++;
                j++;
            }
        }
        return String.valueOf(arr[arr.length-k]);
    }

	
