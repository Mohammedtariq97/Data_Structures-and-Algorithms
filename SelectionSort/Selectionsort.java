package algo.selectionSort;

public class App {

	public static void main(String[] args) {
		
		int [] myArray= selectionSort(new int[] {2,1,7,4,8,3});
		
		for(int i : myArray) {
			
			System.out.println(i);
		}
	}

	
	public static int[] selectionSort(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			
			int minimum = i;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j] < a[minimum]) {
					
					minimum = j;
				}							
			}
			int temp = a[i];
			a[i]= a[minimum];
			a[minimum] = temp;
			
		}
			
		return a;
	}
}
