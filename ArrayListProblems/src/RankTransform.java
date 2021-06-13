import java.util.Arrays;

public class RankTransform {
	 public int[] arrayRankTransform(int[] arr) {
	        int[] res = new int[arr.length];
	    
	        for(int i=0; i<arr.length; i++){
	            res[i] = arr[i];
	        }
	        
	        Arrays.sort(res);
	        
	        int[] val = new int[arr.length];
	        int j =0;
	        for(int i=0;i<res.length;i++){
	            if(i == res.length -1){
	                val[j] = j+1;
	            }else if(res[i] != res[i+1]){
	                val[j] = j+1;
	                j++;
	            }
	        }
	        return val;
	    }
}
