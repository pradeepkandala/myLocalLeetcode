package sampleleetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfSortedArray {
// this is not fully complete yet, have to complete it still.
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int[] pos = searchRange(nums, 9);
		System.out.println(Arrays.toString(pos));

	}

	public static int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length;
		int mid = nums.length / 2;
		while (true) {
			if (target < nums[mid]) {
				end = mid;
				mid = (start + end) / 2;
			} else if (target == nums[mid]) {
				return new int[] { mid, mid };

			} else {
				start = mid;
				mid = (start + end) / 2;
			}
			if(end-start <= 1)
				break;
		}

		return new int[] { -1, -1 };

	}

}
