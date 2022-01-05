public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i=0;i<target.length;i++){
            map1.put(target[i],map1.getOrDefault(target[i],0)+1);
            map1.put(arr[i],map1.getOrDefault(arr[i],0)-1);
        }
        for(int i:map1.keySet()){
            if(map1.get(i) != 0) return false;
        }
        return true;
    }

	
