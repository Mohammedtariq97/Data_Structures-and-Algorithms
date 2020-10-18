package algo.recursiveBinarySearch;

public class App {
	public static void main(String[] args) {
		System.out.println(recursiveBinarySearch(new int[] { 1, 2, 3, 4, 6, 8, 12, 18 }, 0, 7, 18));
	}

	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
	     if(p>r) {
	       	return -1;
      	}else {
		   int q=(p+r)/2;
		   if(a[q]==x) {
			    return q;
		   }else if(a[q]>x) {
			return recursiveBinarySearch(a, p, q-1,x);
		   }else {
			return recursiveBinarySearch(a, q+1, r,x);
		  }
	}
}
}
