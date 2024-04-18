package arrays101;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = new int[] {2,5,6};
		int n = 3;
		
		
		int num =2;
		for(int i=0;i<nums1.length-1;i++) {
			if(num >= nums1[i] && num < nums1[i+1]) {
				for(int j=nums1.length-1;j<i;j--) {
					nums1[j]=nums1[j-1];
				}
				nums1[i]=num;
			}		
		}
		for(int i=0;i<nums1.length;i++) {
			System.out.print(" "+ nums1[i]);
		}

	}

}
