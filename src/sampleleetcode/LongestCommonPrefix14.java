package sampleleetcode;

public class LongestCommonPrefix14 {

	public static void main(String[] args) {
		String commonPrefix = longestCommonPrefix(new String[] { "flower", "flies", "fly" });
		System.out.println(commonPrefix);

	}

	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 1)
			return strs[0].toString();
		
		StringBuffer sb = new StringBuffer();
		
		int minLength = 9999;
		for (int i = 0; i < strs.length; i++) {
			if (minLength >= strs[i].length())
				minLength = strs[i].length();

		}
		if (minLength == 0)
			return sb.toString();
		
		int pos=0;
		while(pos < minLength) {
			char ch = strs[0].charAt(pos);
			for(int i=1;i<strs.length;i++) {
				if(strs[i].charAt(pos)!=ch)
					return sb.toString();
			}
			sb.append(ch);
			pos++;	
		}
		return sb.toString();

	}

}
