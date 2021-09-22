
public class BalancedStringSplit {
	public int balancedStringSplit(String s) {
        int cR = 0;
        int cL = 0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                cR++;
            }else{
                cR--;
            }
	//If both value are equal, substring is balanced
            if(cR == cL){
                count++;
                cR =0;
                cL =0;
            }
        }
        return count;
    }
}
