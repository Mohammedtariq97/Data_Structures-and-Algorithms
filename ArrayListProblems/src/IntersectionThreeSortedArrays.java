import java.util.ArrayList;
import java.util.List;

public class IntersectionThreeSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,5,7,9};
		int[] arr3 = new int[] {1,3,4,5,8};
		
		List<Integer> list = arraysIntersection(arr1,arr2,arr3);
		for(Integer i:list) {
			System.out.println(i);
		}
	}
	
	public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<Integer>();
        int p1 =0;
        int p2 = 0;
        int p3 = 0;
        
        while(p1 < arr1.length && p2<arr2.length && p3<arr3.length){
            
            if(arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]){
                list.add(arr1[p1]);
                p1++;
                p2++;
                p3++;
            }else{
                if(arr1[p1] < arr2[p2]){
                    p1++;
                }else if(arr2[p2]<arr3[p3]){
                    p2++;
                }else{
                    p3++;
                }
            }
        }
        
        return list;
    }

}
