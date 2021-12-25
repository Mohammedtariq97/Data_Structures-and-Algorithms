public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set<Character> Jset = new HashSet();
        for (char j: jewels.toCharArray()){
            Jset.add(j);
        }
        for (char s: stones.toCharArray()){
            if (Jset.contains(s)){
                ans++;
            }  
        }
        return ans;
    }