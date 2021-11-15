public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        String arr= "";
        for(int i=0;i<num.length;i++){
            arr = arr + Integer.toString(num[i]);
        }
        int val = Integer.parseInt(arr) + k;
        String resVal = Integer.toString(val);
        for(int i=0;i<resVal.length();i++){
            char c = resVal.charAt(i);
            int c1 = Integer.parseInt(Character.toString(c));
            list.add(c1);
        }
        return list;
    }

	
