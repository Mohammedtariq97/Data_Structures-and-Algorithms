public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                list.remove(arr[i]);
            }else{
                map.put(arr[i],1);
                list.add(arr[i]);
            }  
        }
        if(list.size()<k){
            return "";
        }else{
            return list.get(k-1);
        }     
    }
