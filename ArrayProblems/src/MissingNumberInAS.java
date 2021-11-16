public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int diff = 0;
        for(int i=0;i<arr.length-1;i++){
            int val = arr[i+1]-arr[i];
            if(i==0){
                diff = Math.max(val,diff);
            }else{
                diff = Math.min(val,diff);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] != diff){
                return arr[i]+diff;
            }
        }
        return arr[0];
    }

	
