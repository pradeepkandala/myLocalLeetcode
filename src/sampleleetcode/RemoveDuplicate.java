package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = removeDuplicates("abbaca");
		System.out.println(str);

	}
	
	 public static String removeDuplicates(String s) {
		 
		 StringBuilder sb = new StringBuilder();

	        char[] ch = s.toCharArray();
	        List<Character> chList = new ArrayList<>();
	        
	        for(int i=0;i<ch.length;i++) {
	        	chList.add(ch[i]);
	        }

	        for(int i=1;i<chList.size();i++){
	            if(chList.get(i-1)==chList.get(i)){
	            	chList.remove(i);
	            	chList.remove(i-1);
	            	i=0;
	            }
	        }
	        for(int i=0; i<chList.size();i++)
			   sb.append(chList.get(i));
	        
	        String st= sb.toString();
	        return st;
	    }

}
