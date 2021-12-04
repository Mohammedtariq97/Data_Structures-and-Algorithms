public List<Integer> selfDividingNumbers(int left, int right) {
        boolean isSDN = true;
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num = i;
            while(num!=0){
                int val= num%10;
                if(val == 0 || i%val!=0){
                    isSDN = false;
                }
                num = num/10;
            }
            if(isSDN){
                list.add(i);
            }
            isSDN = true;
        }
        return list;
    }

	
