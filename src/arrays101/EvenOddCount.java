package arrays101;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findNumbers(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length() % 2 == 0){
                sum++;
            }
        }
        return sum;
        
    }

}
