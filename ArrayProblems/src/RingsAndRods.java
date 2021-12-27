public int countPoints(String rings) {
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
    
        int rV=0;
        int gV = 0;
        int bV=0;
        int n = rings.length();
    
    for(int i=0; i<n; i+=2){
     
        int a = rings.charAt(i+1)-'0';
        
        if(rings.charAt(i) == 'R'){
            r.add(a,rV++);
        }
        else if(rings.charAt(i) == 'G'){
            g.add(a,gV++);
        }
        else if(rings.charAt(i) == 'B'){
            b.add(a,bV++);
        }
    }
    
    int count=0;
    for(int j=0; j<10; j++){
        int red= r.get(j);
        if(red > 0 && g.get(j) > 0 && b.get(j) > 0)
            count++;
    }
    
    return count;
    }

	
