public int largestUniqueNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int val = -1;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue() == 1){
                val = Math.max(m.getKey(),val);
            }
        }
        return val;
    }
