package sampleleetcode;

public class SortArrayByParity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] sortArrayByParityII(int[] nums) {

		int[] arr = new int[nums.length];
		
		for(int i=0,j=0,k=1;i<nums.length;i++,j++,k++) {
			if(nums[i]%2==0) {
				arr[j]=nums[i];
			}else {
				arr[k]=nums[i];
			}
		}
		return arr;
	}
	

}
