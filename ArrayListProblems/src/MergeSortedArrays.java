
public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[j]<nums1[i]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
	
	//COMPLEXITY REDUCED
	public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        
        for(int p = m+n-1;p>=0;p--){
            if(p2<0){
                break;
            }
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            } else{
                nums1[p] = nums2[p2];
                p2--;
            }
        }
        
    }
}
