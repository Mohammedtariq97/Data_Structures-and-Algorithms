import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {4,6,3,2,7,5};
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
	
	//Only for small set since we use two loops i.e. O(n2)
	private static int[] insertionSort(int[] arr) {
		int j,temp,key;
		for(int i=1;i<arr.length;i++) {
			j = i-1;
			key = arr[i];	
			while(j>=0 && key<arr[j]) { //Comparing arr[i] to all values to the left
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}		
		return arr;
	}
}

