package sampleleetcode;

import java.util.Arrays;

public class FindContentChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findContentChildren(int[] g, int[] s) {
	      int contentChildren =0;
	      int cookieIndex=0;
	      Arrays.sort(g);
	      Arrays.sort(s);
	      
	      while(contentChildren<g.length || cookieIndex<s.length) {
	    	  if(g[contentChildren]>=s[cookieIndex]) {
	    		  contentChildren++;
	    		  cookieIndex++;
	    	  }else {
	    		  cookieIndex++;
	    	  }
	      }
	      
	      
	      return contentChildren;
	      
	}

}
