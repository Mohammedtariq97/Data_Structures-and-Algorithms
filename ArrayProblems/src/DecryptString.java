class Solution {
    public String freqAlphabets(String s) {
        Map<String,Character> map = new HashMap<>();
        char c = 'a';
        for(int i=1;i<=26;i++){
            if(i<10){
                if(map.isEmpty){
                    map.put(i.toString(),c);
                }else{
                    map.put(i.toString(),c+1);
                }
            }else{
                map.put()
            }
        }
    }
    
}