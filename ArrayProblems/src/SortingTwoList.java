import java.util.Arrays;

public class SortingTwoList {

	public static void main(String[] args) {
		
		System.out.println("Water");
		int[] arr1 = new int[] {2,3,5,7,9,11};
		int[] arr2 = new int[] {1,4,6,8};
		
		int[] result = mergeArray(arr1,arr2);
		
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int[] res = new int[arr1.length + arr2.length];
		
		int l,r,k;
		l=r=k=0;
		
		while(l< arr1.length || r<arr2.length) {
			
			if(l < arr1.length && r< arr2.length) {
				
				if(arr1[l] < arr2[r]) {
					res[k] = arr1[l];
					k++;
					l++;
				}else {
					res[k] = arr2[r];
					k++;
					r++;
				}
			}else if (l < arr1.length) {
				res[k] = arr1[l];
				k++;
				l++;
			}else if(r<arr2.length) {
				res[k] = arr2[r];
				k++;
				r++;
			}
		}
		
		return res;
	}

}
