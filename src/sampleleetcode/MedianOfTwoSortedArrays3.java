package sampleleetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays3 {

	public static void main(String[] args) {
		int[] nums1 = { 100001 };
		int[] nums2 = {100000};
		double median = findMedianSortedArrays(nums1, nums2);
		System.out.println(median);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		 
		   List<Integer> al = new ArrayList<>();

		   for(int i=0;i<nums1.length;i++) {
			   al.add(nums1[i]);
		   }
		   for(int i=0;i<nums2.length;i++) {
			   al.add(nums2[i]);
		   }
		   Collections.sort(al);
		   if(al.size()%2 != 0) {
			   return (double) al.get(al.size()/2);
		   } else {
			   double sum = al.get(al.size()/2) + al.get((al.size()/2)-1);  
			   return sum/2;
		   }
		   
		   
		   
		   
		   
		/*     if (nums1.length == 0) {
					if (nums2.length == 1)
						return  nums2[0];
					else if (nums2.length % 2 == 1) {
						return nums2[nums2.length / 2];
					} else {
						return (nums2[(nums2.length - 1) / 2] + nums2[nums2.length / 2]) / 2.0;
					}
				}

				if (nums2.length == 0) {
					if (nums1.length == 1)
						return  nums1[0];
					else if (nums1.length % 2 == 1) {
						return nums1[nums1.length / 2];
					} else {
						return (nums1[(nums1.length - 1) / 2] + nums1[nums1.length / 2]) / 2.0;
					}
				}
		    int len = nums1.length + nums2.length;
		    int[] nums = new int[len];

		    for(
		    int k = 0, j = 0, i = 0;k<len;k++)
		    {
		        if (i < nums1.length && j < nums2.length && nums1[i] <= nums2[j]) {
		            nums[k] = nums1[i];
		            i++;

		        } else if (j < nums2.length) {
		            nums[k] = nums2[j];
		            j++;

		        }
		        System.out.println("value of k: " + k + " nums here " + nums[k]);
		    }for(
		    int i = 0;i<len;i++)
		    {
		        System.out.print("  " + nums[i]);
		    }if(len%2==1)
		    {
		        median = nums[len / 2];
		    }else
		    {
		        median = (nums[(len - 1) / 2] + nums[len / 2]) / 2.0;
		    }

		    return median;*/
	}

}
