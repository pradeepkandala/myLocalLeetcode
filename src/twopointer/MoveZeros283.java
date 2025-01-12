package twopointer;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args){
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        int[] nums2 =moveZeroes(nums);
        System.out.print(Arrays.toString(nums2));
    }
    public static int[] moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] != 0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++; j++;
            } else if(nums[i] != 0 && nums[j] == 0){
                 i++; j++;
            } else if(nums[i] != 0  && nums[j] != 0){
                i++;j++;
            }else
                j++;
        }
        return nums;
    }
}
