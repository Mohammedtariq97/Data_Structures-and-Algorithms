
public class TwoSumLessThanTarget {
	public int twoSumLessThanK(int[] nums, int k) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum < k && i!=j){
                    res = Math.max(res,sum);
                }
            }      
        }
        if(res == 0){
            return -1;
        }else return res;
        
    }
	
	//Two pointer approach
	public int twoSumLessThanK2(int[] nums, int k){
		for(int i=0,j=i+1;i<nums.length && j<nums.length;){
            if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i=0;
                j=i+1;
            }else{
                i++;
                j++;
            }
        }
        int left = 0;
        int right = nums.length -1;
        int answer = -1;
        while(left < right){
            int sum = nums[left]+nums[right];
            if(nums[left]+nums[right] < k){
                answer = Math.max(answer,sum);
                left++;
            }else{
                right--;
            }
        }
        return answer;
	}
}
