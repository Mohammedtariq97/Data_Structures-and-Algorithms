import java.util.Arrays;
import java.util.HashMap;

public class IntersectionTwoArrays {
	 public int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	        for(int n:nums1){
	            map.put(n,map.getOrDefault(n,0) +1);
	        }
	        
	        //Comparing 2nd array elements with map
	        int k=0;
	        for(int n:nums2){
	            int count = map.getOrDefault(n,0); //getting the frequency of number
	            if(count > 0){
	                nums1[k] = n; //ReUsing 1st array
	                k++;
	                map.put(n,count-1); //Decrementing(count) key's value since we added in array
	            }
	        }
	        //returning 1st array till index 'k'
	        return Arrays.copyOfRange(nums1,0,k);
	    }
}
