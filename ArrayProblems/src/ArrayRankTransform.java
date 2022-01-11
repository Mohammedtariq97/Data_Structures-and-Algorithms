 public int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
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
        return arr;
    }

	
