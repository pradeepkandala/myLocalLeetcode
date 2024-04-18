package sampleleetcode;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3};
		System.out.println(isMonotonic(nums));

	}

	public static boolean isMonotonic(int[] nums) {
		// boolean monotonic = false;
		if (nums.length == 1)
			return true;

		int diff = nums[0] - nums[nums.length - 1];
		if (diff == 0) {
			for (int i = 0; i < nums.length-1; i++) {
              if(nums[i] != nums[i+1])
            	  return false;
			}
		}else if (diff > 0) {
			for (int i = 0; i < nums.length-1; i++) {
              if(nums[i] < nums[i+1])
            	  return false;
			}
		} else {
			for (int i = 0; i < nums.length-1; i++) {
	              if(nums[i] > nums[i+1])
	            	  return false;
				}
		}
		

		return true;

	}

}
