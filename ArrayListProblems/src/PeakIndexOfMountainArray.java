
public class PeakIndexOfMountainArray {
	public int peakIndexInMountainArray(int[] arr) {
        int index =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                index = i+1;
            }
        }
        return index;
    }
}
