package leetcode.medium;

public class ReverseWordsInString151 {
	public static void main(String args[]) {
		String s = reverseWords(" the sky is      blue ");
		System.out.println(s);

	}

	public static String reverseWords(String s) {

		s = s.trim().replaceAll(" +", " ");
		
		String[] str = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = str.length - 1; i >= 0; i--) {
			sb.append(str[i]);
			sb.append(" ");
		}

		return sb.toString();

	}

}
