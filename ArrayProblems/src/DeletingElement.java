
public class ElementDeleting {
	//deleted element in place
	public int removeElement(int[] nums, int val) {
        int i=0;
        int j= nums.length;
        while(i<j){
            if(nums[i] == val){
                nums[i]= nums[j-1];
                j--;
            }else{
                i++;
            }
        }
        return j;
    }
}
