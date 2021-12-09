 public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        int index = 0;
        for(int i=0;i<emails.length;i++){
            index = emails[i].indexOf("@");
            String s1 = emails[i].substring(0,index);
            String s2 = emails[i].substring(index+1,emails[i].length());
            s1 = s1.replace(".","");
            if(s1.contains("+")){
                int x = s1.indexOf("+");
                s1 = s1.substring(0,x);
            }
            String res = s1+"@"+s2;
            if(!set.contains(res)){
                set.add(res);
            }
        }
        return set.size();
    }
