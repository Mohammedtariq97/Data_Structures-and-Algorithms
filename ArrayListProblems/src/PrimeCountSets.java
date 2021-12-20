public int countPrimeSetBits(int left, int right) {
        int sum=0;
        int resCount = 0;
        for(int i=left;i<=right;i++){
            int count = 0;
            int val = i;
            while(val>0){
                sum = val%2;
                val = val/2;
                if(sum == 1){
                    count++;
                }
            }
            resCount++;
        }
        return resCount;
    }