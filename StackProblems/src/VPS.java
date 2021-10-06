public int maxDepth(String s) {
        String str = s.replaceAll("[0-9-+*/]","");
        
        Stack stack = new Stack<Character>();
        int count =0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
        
            if(c == '('){
                stack.push('(');
            }else{
                stack.pop();
                count++;
            }
        }
        return count;
    }
