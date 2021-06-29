
public class maxProductArray {
	public int maxProduct(int[] nums) {
        int result =0;
       int endResult =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a = (nums[i]-1) * (nums[j]-1);
                result = Math.max(a,result);
            }
            endResult = Math.max(endResult,result);
            result =0;
        }
        
        return endResult;
    }
}
