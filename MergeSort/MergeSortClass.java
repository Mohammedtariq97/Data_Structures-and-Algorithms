import java.util.Arrays;

public class MergeSortClass {

	public static void main(String args[]) {
		
		int[] arr = new int[] {5,4,3,2,1};
		
		int[] res = mergeSort(arr);
		
		System.out.println(Arrays.toString(res));
		
	}
	
	private static int[] mergeSort(int[] arr) {
		
		if(arr.length <= 1) {
			return arr;
		}
		
		int mid = arr.length /2;
		
		int[] left = new int[mid];
		int[] right;
		
		if(arr.length % 2 == 0) {
			right = new int[mid];
		}else {
			right = new int[mid+1];
		}
		
		for(int i=0;i< mid;i++) {
			left[i] = arr[i];
		}
		
		for(int j=0;j<right.length;j++) {
			right[j] = arr[mid + j];
		}
		
		int[] res = new int[arr.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		res = MergingTwoList.mergeArray(left, right);
		
		return res;
		
	}
}
