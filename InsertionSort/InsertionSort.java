package algo.insertionSort;

public class App1 {
	public static void main(String[] args) {
		int [] myArray= insertionSort(new int[] {2,1,7,4,8,3});
		for(int s : myArray) {
			System.out.println(s);
		}
	}

	public static int[] insertionSort(int a[]) {
		for(int i=1; i<a.length; i++) {
		  int element =a[i];
		  int j=i-1;
		  while(j>=0 && a[j]>element) {
			  a[j+1] = a[j];
			  j--;
		  }
		  a[j+1] = element;
		}
			return a;
	}
}
