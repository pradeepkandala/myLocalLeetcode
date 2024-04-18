package leetcode.medium;

public class LongestSubStringWithoutReapatingChars3 {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}

	public static int lengthOfLongestSubstring(String s) {
		int max = 1;
		char[] stArray = s.toCharArray();

		int i = 1, sum = 1;
		while (i < stArray.length) {
			StringBuffer sb = new StringBuffer();
			sb.append(stArray[i]);
			
			if (stArray[i] != stArray[i - 1]) {
				sum++;
				if (max < sum)
					max = sum;
			} else
				sum = 1;
			i++;
		}

		return max;

	}

}
