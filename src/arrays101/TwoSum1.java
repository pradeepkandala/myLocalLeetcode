package arrays101;

public class TwoSum1 {
    public static void main(String[] args){
        int[] nums = {2,11,7,15};
        int target = 9;
        int[] twoSum = twoSum(nums, target);
        System.out.println("[ " + twoSum[0] + " , " + twoSum[1] + "]");
    }
    public static int[] twoSum(int[] nums, int target) {

        int[] twoSum = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j < nums.length;j++){
                if(target == nums[i]+nums[j]){
                    twoSum[0] = i ;
                    twoSum[1] = j ;
                    break;
                }
            }
        }
        return twoSum;
    }
}
