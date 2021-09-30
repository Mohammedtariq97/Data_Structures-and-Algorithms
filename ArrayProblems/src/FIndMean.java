
public class MeanTrim {
	 public double trimMean(int[] arr) {
	        for(int i=0,j=i+1;i<arr.length&&j<arr.length;){
	            if(arr[i]>arr[i+1]){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i=0;
	                j = i+1;
	            }else{
	                i++;
	                j++;
	            }
	        }
	        int sum = 0;
	        int count = 0;
	        int large = (int) 0.95 * arr.length;
	        int small = (int) 0.05 * arr.length;
	        for(int i=small;i<large;i++){
	            sum = sum + arr[i];
	            count++;
	        }
	        double d = sum/count;
	        return d;
	    }
}
