import java.util.Arrays;

public class SortingTransformed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,3,1,2};
		System.out.println(Arrays.toString(sortTransformedArray(nums,1,3,5)));
	}
	
	public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        for(int i=0;i<nums.length;i++){
            nums[i] = quadraticResult(nums[i],a,b,c);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    
    public static int quadraticResult(int num,int a, int b, int c){
        int val = (int)Math.pow(num,2);
        return (a*val)+(b*num)+c;
    }

}
