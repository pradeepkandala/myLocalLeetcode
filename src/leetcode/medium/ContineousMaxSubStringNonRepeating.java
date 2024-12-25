package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ContineousMaxSubStringNonRepeating {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("pwwkew");
        System.out.print(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        Map<String, Integer> subStrings = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s.charAt(i));

            for (int j = i+1 ; j < s.length(); j++) {
                if (!sb.toString().contains(String.valueOf(s.charAt(j)))) {
                    sb.append(s.charAt(j));
                } else {
                    subStrings.put(sb.toString(), sb.length());
                    j= s.length();
                }
            }

        }
        int max = 0;
        for(int value: subStrings.values()){
            if(value >= max)
                max = value;
        }
        return max;
    }
}
