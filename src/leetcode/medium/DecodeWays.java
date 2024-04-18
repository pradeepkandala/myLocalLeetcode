package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

	
	public static void main(String[] args) {
		String s ="1243";
		int sum = numDecodings(s, new HashMap<>());
		System.out.println(sum);
	}
	
	public static int numDecodings(String s) {
		return numDecodings(s, new HashMap<>());
	}
	 public static int numDecodings(String s, Map<String,Integer> hm) {
		 	
		 	if(hm.containsKey(s))
		 	{
		 		return hm.get(s);
		 	}
	        if(s.length() == 0) {
				 return 1;
			 }else if(s.charAt(0) == '0') {
				 return 0 ;
			 } else if(s.length()==1) {
				 return 1;
			 } else if (s.charAt(0) == '1' || (s.charAt(0) == '2' && s.charAt(1) < '7')) {
				 int value = numDecodings(s.substring(1),hm)+ numDecodings(s.substring(2),hm);
				 hm.put(s, value);
				 return value;
			 } else {
				 int value =  numDecodings(s.substring(1),hm);
				 hm.put(s, value);
				 return value;
			 }
	 }
}
