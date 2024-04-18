package arrays101;

import java.util.Arrays;

public class SortedSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
            
        }
        Arrays.sort(nums);
        return nums;
    }

}
