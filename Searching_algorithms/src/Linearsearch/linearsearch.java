package algo.linearsearch;

public class App{

	public static void main(String [] args) {
		System.out.println(linearSearch(new int[] {2,4,6,7,12,15,17}, 6));
	}

public static int linearSearch(int[] a, int x) {
		int answer = -1;
		for(int i=0; i<a.length;i++) {
			if(a[i]==x) {
				answer = i;
			}
		}
		return answer;
	}
}
