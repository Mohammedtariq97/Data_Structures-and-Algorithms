public int findKthPositive(int[] arr, int k) {
        int val = 0;
        int j=0;
        List list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=1000;i++){
            if(!set.contains(i)){
                list.add(i);
                j++;
            }
            if(list.size()==k){
                break;
            }
        }
        return Integer.parseInt(list.get(list.size()-1).toString());
    }
