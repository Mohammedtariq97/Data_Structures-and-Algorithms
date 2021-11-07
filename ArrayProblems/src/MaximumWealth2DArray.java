public int maximumWealth(int[][] accounts) {
        int val = 0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            val = Math.max(sum,val);
            sum = 0;
        }
        return val;
    }

	
