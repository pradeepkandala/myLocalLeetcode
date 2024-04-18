package arrays101;

public class MergeAlternately1768 {

	public static void main(String[] args) {
		
		String str1= "ab";
		String str2 = "pqrs";
		String merged = mergeAlternately(str1,str2);
		
		System.out.println(merged);

	}

	public static String mergeAlternately(String word1, String word2) {
		
		if(word1.length()==0 && word2.length()==0)
			return null;
		StringBuffer sb = new StringBuffer();
		if(word1.length() >= word2.length()) {
			
			for(int i=0;i<word2.length();i++) {
				sb.append(word1.charAt(i));
				sb.append(word2.charAt(i));
			}
			sb.append(word1.substring(word2.length()));
			
		} else {
			for(int i=0;i<word1.length();i++) {
				sb.append(word1.charAt(i));
				sb.append(word2.charAt(i));
			}
			sb.append(word2.substring(word1.length()));
			
		}
		return sb.toString();

	}

}
