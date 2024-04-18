package sampleleetcode;

public class RomanToInt {

	public static void main(String[] args) {
		/*
		 * I             1
		 * V             5
		 * X             10
		 * L             50
		 * C             100
		 * D             500
		 * M             1000
		 */
		int num = romanToInt("MCMXCIV");
		System.out.println(num);
		
	}

	public static int romanToInt(String s) {
		int sum =0; 
		s=s.replace("IV", "IIII");
		s=s.replace("IX","VIIII");
		s=s.replace("XL","XXXX");
		s=s.replace("XC","LXXXX");
		s=s.replace("CD","CCCC");
		s=s.replace("CM","DCCCC");
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='M')
				sum=sum+1000;
			else if(s.charAt(i)=='D')
				sum=sum+500;
			else if(s.charAt(i)=='C')
				sum=sum+100;
			else if(s.charAt(i)=='L')
				sum=sum+50;
			else if(s.charAt(i)=='X')
				sum=sum+10;
			else if(s.charAt(i)=='V')
				sum=sum+5;
			else if(s.charAt(i)=='I')
				sum=sum+1;
			
		}
		
		return sum;
		
	}

}
