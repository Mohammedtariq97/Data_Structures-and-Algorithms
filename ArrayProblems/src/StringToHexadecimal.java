 public String toHex(int num) {
        int pow = 0;
        String hexa_dec = "";
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while(num>0){
            int rem =num%16;
            hexa_dec = hex[rem]+ hexa_dec;
            num = num/16;
        }
        return hexa_dec;
    }

	
