package sampleleetcode;

import java.util.HashMap;
import java.util.Map;

public class RasomNote {

	public static void main(String[] args) {
		
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		
		if(ransomNote.length()>magazine.length())
			return false;
		
		Map<Character,Integer> magHash = new HashMap<>();
		
		for(int i=0;i<magazine.length();i++) {
		   char m = magazine.charAt(i);
		   
		   int currentCount = magHash.getOrDefault(m, 0);
		   
		   magHash.put(m, currentCount+1);
		   
		}
		
		for(int j=0;j<ransomNote.length();j++) {
			char r = ransomNote.charAt(j);
			int currentCount = magHash.getOrDefault(r, 0);
			if(currentCount==0)
				return false;
			else 
				magHash.put(r, currentCount-1);
			
		}
		
		return true;
		
	}

}
