package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class PowerOfTwo231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1073741824));

	}
	
	public static boolean isPowerOfTwo(int n) {
        
        for(int i=0;i<31;i++) {
        	if(n == (long) Math.pow(2, i))
        		return true;
        	
        }
        return false;
        
    }

}
