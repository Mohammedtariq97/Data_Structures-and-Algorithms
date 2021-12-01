public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
        
        //0ms solution
        int count = 0;
        int lessthan = 0;
        
        for(int n:nums){
            if(n == target) count++;
            if(n<target) lessthan++;
        }
        
        for(int i=0;i<count;i++){
            list.add(lessthan++);
        }
            
        return list;
    }

	
