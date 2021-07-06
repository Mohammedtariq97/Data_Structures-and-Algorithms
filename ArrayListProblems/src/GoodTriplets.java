
public class GoodTriplets {
	 public int countGoodTriplets(int[] arr, int a, int b, int c) {
	        int count = 0;
	        for(int i=0;i<arr.length-2;i++){
	            for(int j=0;j+1<arr.length;j++){
	                if(j != i && j+1 != i){
	                    int c1 = Math.abs(arr[i] - arr[j]);
	                    int c2 = Math.abs(arr[j] - arr[j+1]);
	                    int c3 = Math.abs(arr[i] - arr[j+1]);
	                if((c1 <= a) && (c2 <= b) && (c3 <= c)){
	                    count++;
	                }
	                }
	            }
	        }
	        return count;
	    }
}
