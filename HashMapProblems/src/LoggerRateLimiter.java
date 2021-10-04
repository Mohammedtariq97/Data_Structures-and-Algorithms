class Logger {
    HashMap<String,Integer> map;
    
    public Logger() {
        map = new HashMap<String,Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message)){
            map.put(message,timestamp);
            return true;
        }else{
            int oldTimeStamp = map.get(message);
            int val = oldTimeStamp + 10;
            if(timestamp >= val){
                map.put(message,timestamp);
                return true;
            }else{
                return false;
            }
        }
        
    }
}
