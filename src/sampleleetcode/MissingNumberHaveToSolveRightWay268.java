package sampleleetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumberHaveToSolveRightWay268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int missingNumber(int[] nums) {
		
		 List<Integer> list = new ArrayList<>();
			
			for(int i=0;i<nums.length;i++) {
				list.add(nums[i]);
			}
			Collections.sort(list);
			int start=list.get(0);
			for(int i=1;i<list.size();i++) {
				if(list.get(i) != start+i) {
					return start+i;
				}
				
			}
			if(start == 0)
			    return start+nums.length;
	        else
	            return start-1;
	}

}
