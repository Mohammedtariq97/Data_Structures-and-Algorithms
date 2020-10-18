package algo.mergeSort;

public class App {

	public static void main(String[] args) {
		
		int[] inputArray = {2,7,4,6,3,1,9,8,5};
		
		MergeSort sorter = new MergeSort();
		
		sorter.sort(inputArray);
		
		for (int i=0; i<inputArray.length; i++) {
			
			System.out.println(inputArray[i]);
		}

}
}