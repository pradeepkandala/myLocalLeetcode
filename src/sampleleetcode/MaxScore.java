package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class MaxScore {

	public static void main(String[] args) {
		String str = "011101";
		int maxVal = maxScore(str);

		System.out.println(maxVal);

	}
	
	public static int maxScore(String s) {
		int maxVal=0;
		int n=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='1')
				n++;
			
		}
		int p0 = 0,p1 = 0;
		for(int i=1;i<ch.length;i++) {
			if(ch[i]=='1')
				p1++;
			else
				p0++;
			int sum = p0 +(n-p1);
			if(sum>maxVal)
				maxVal = sum;
		}
		
		
		
		return maxVal;
		
	}

	/*
	 * public static int maxVal(List<Integer> ar) { int maxVal = ar.get(0); for (int
	 * i = 1; i < ar.size(); i++) { if (maxVal < ar.get(i)) maxVal = ar.get(i); }
	 * return maxVal; }
	 */
	/*
	 * public static int maxScore(String s) {
	 * 
	 * List<Integer> finalList = new ArrayList<>();
	 * 
	 * char[] initialList = s.toCharArray();
	 * 
	 * for (int i = 0; i < initialList.length; i++) { int sumZero = 0; int sumOne =
	 * 0; for (int z = 0; z <= i; z++) {
	 * 
	 * if (initialList[z] == '0') sumZero++; } for (int j = i + 1; j <
	 * initialList.length; j++) {
	 * 
	 * if (initialList[j] == '1') sumOne++;
	 * 
	 * } finalList.add(sumZero + sumOne); }
	 * 
	 * int maxVal = maxVal(finalList); return maxVal; }
	 */
}
