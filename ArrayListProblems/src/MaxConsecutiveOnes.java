
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int resCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
        
            }else{
                resCount = Math.max(resCount,count);
                count =0;
            }
        }
        return Math.max(resCount,count);
    }
}
