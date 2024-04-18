package sampleleetcode;

import java.math.BigInteger;

public class PlusOne66 {

	public static void main(String[] args) {
		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[] plusOne = plusOne(digits);
		for(int i=0;i<plusOne.length;i++) {
			System.out.print(" "+ plusOne[i]);
		}

	}

	public static  int[] plusOne(int[] digits) {
		
		if(digits.length == 0)
			return null;
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<digits.length;i++) {
			sb.append(digits[i]);
		}
		
		BigInteger  number = new BigInteger(sb.toString());
		
		BigInteger newValue = number.add(new BigInteger("1"));
		
		String s = String.valueOf(newValue);
		int[] plusOneRev = new int[s.length()];
		
		for(int i=s.length()-1 ; i >= 0; i--) {
			
			plusOneRev[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		
		return plusOneRev;
		
		

	}

}
