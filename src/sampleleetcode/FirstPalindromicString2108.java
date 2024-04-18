package sampleleetcode;

public class FirstPalindromicString2108 {

	public static void main(String[] args) {
		String[] words = {"abc","car","ada","racecar","cool"};
		
		String palindromeString = firstPalindrome(words);
		
		System.out.println("palindrome string " + palindromeString);

	}

	public static String firstPalindrome(String[] words) {
		String str="";
		for(int i=0;i<words.length;i++) {
			if(isPalindrome(words[i]))
					return words[i];
		}
		
		return str;

	}

	private static boolean isPalindrome(String string) {
		char[] str = string.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i = str.length-1 ; i >= 0 ; i--) {
			sb.append(str[i]);
		}
		
		
		if(string.equals(sb.toString()))
			return true;
		
		return false;
	}

}
