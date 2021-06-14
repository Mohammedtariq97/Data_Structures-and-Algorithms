
public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int k =0;
        
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    res[k] = arr1[j];
                    k++;
                }
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<res.length;j++){
                if(arr1[i] != res[j]){
                    res[k] = arr1[i];
                }
            }
        }
        
        return res;
    }
}
