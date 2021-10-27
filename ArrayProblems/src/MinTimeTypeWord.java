public int minTimeToType(String word) {
        int count = word.length(); //since we need to type each character each second
        char prev = 'a';
        for(int i=0;i<word.length();i++){
            char cur = word.charAt(i);
            int diff = Math.abs(cur-prev);
            count = count + Math.min(diff, 26-diff); //minimum distance to move
            prev = cur; // reassigning the previous char
        }
        return count;
    }

	
