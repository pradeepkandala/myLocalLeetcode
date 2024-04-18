package sampleleetcode;

public class GreatestCommonDivisor1071 {
//STILL TO DO NOT COMPLETED
	public static void main(String[] args) {
		

	}
	
	public static String gcdOfStrings(String str1, String str2) {
		String str="";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(str1.length() >= (str2.length()/2)) {
			if(str1.contains(str2))
				return str2;
		} else {
			if(str2.contains(str1))
				return str1;
		}
		
		
		return str;
        
    }

}
