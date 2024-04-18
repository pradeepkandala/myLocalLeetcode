package arrays101;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3, 6, 7};
        int val = 3;

        int result = removeElement(nums, val);

        System.out.print("Modified array: [");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i]);
            if (i < result - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Number of elements not equal to " + val + ": " + result);
    }

}
