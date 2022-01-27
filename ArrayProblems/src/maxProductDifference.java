public int maxProductDifference(int[] nums) {
        for(int i=0,j=1;i<nums.length&&j<nums.length;){
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
        return (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);
}
