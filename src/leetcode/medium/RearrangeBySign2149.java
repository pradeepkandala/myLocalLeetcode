package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class RearrangeBySign2149 {

	public static void main(String[] args) {

	}

	public static int[] rearrangeArray(int[] nums) {
		int[] sorted = new int[nums.length];
		List<Integer> positives = new ArrayList<>();
		List<Integer> negatives = new ArrayList<>();
		List<Integer> combines = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				positives.add(nums[i]);
			else
				negatives.add(nums[i]);
		}
		
		for (int i = 0; i < nums.length/2; i++) {
			combines.add(positives.get(i));
			combines.add(negatives.get(i));
		}
		
		for (int i = 0; i < nums.length; i++) {
			sorted[i]= combines.get(i);
		}
		

		return sorted;

	}

}
