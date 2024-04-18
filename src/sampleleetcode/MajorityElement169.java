package sampleleetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {

	}

	public static int majorityElement(int[] nums) {
		Map<Integer,Integer> elementsCount = new HashMap<>();
		int maxNum =0;
		for(int i=0;i<nums.length;i++) {
			if(elementsCount.containsKey(nums[i])) {
				elementsCount.put(nums[i], elementsCount.get(nums[i])+1);
			} else {
				elementsCount.put(nums[i],1);	
			}
		}
		 for(Map.Entry<Integer, Integer> me: elementsCount.entrySet()) {
	        	if(me.getValue() > nums.length/2) {
	        		return me.getKey();
	        	}
	        		
	        }
		return maxNum;

	}

}
