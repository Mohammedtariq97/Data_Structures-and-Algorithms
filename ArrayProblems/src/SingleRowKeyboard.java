public int calculateTime(String keyboard, String word) {
        int sum = 0;
        int dup =0;
        for(int i=0;i<word.length();i++){
            int val = keyboard.indexOf(word.charAt(i));
            dup = Math.abs(dup - val);
            sum = sum + dup;
        }
        return sum;
    }

	
