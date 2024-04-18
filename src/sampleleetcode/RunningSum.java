package sampleleetcode;

public class RunningSum {

	public static void main(String[] args) {
		
		int[] runningSum = runningSum(new int[] {1,2,3,4,5});
		
		for(int i=0;i<runningSum.length;i++) {
			System.out.println("  " +runningSum[i] + " ");
		}

	}
	
	public static int[] runningSum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+ nums[i];
			nums[i]=nums[i]+sum;
		}
        return nums;
    }

}
