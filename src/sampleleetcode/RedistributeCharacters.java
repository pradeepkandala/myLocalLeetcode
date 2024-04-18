package sampleleetcode;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacters {

	public static void main(String[] args) {
		System.out.println(makeEqual(new String[]{"a","a","a"}));

	}
	public static boolean makeEqual(String[] words) {
        int sum=0;
        if(words.length==1) {
        	return true;
        }
        
        Map<Character,Integer> myMap= new HashMap<>();
        for(int i=0;i<words.length;i++) {
        	sum=sum+words[i].length();
        	for(int j=0;j<words[i].length();j++) {
        		if(myMap.containsKey(words[i].charAt(j))) {
        			myMap.replace(words[i].charAt(j), myMap.get(words[i].charAt(j)),myMap.get(words[i].charAt(j))+1);
        		}
        		else 
        			myMap.put(words[i].charAt(j), 1);
        	}
        }
        for(Map.Entry<Character, Integer> me: myMap.entrySet()) {
        	if(me.getValue()%words.length != 0) {
        		return false;
        	}
        		
        }
        
        if(sum%words.length == 0)
        	return true;
        return false;
        
    }

}
