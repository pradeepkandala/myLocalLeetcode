package arrays101;

public class DeletingArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,3,3,3,3,4,5,5,6};
		int removedNumbers =  removeDuplicates(nums);
		
		System.out.println("\n"+removedNumbers);
	}

	public static int removeDuplicates(int[] nums) {
		 int i = 0;
		    for (int n : nums) {
		    	System.out.println("value of n: " +n);
		    	if (i == 0 || n > nums[i-1]) {
		    		System.out.println("value of operated n: " +n);
		    		nums[i++] = n;
		    	}
		            
		    }
		        
		    return i;
		
		

	}

}
