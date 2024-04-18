package leetcode.medium;

public class Pow50 {

	public static void main(String[] args) {
		double x = 2.00000;
		int n = -2147483648;
		System.out.println(myPow(x, n));

	}

	public static double myPow(double x, int n) {
		 if (n == 0)
		        return 1.0;
		    
		    if (n < 0) {
		        if (n == Integer.MIN_VALUE) {
		            // Handling special case for Integer.MIN_VALUE to avoid overflow
		            return 1.0 / (myPow(x, Integer.MAX_VALUE) * x);
		        } else {
		            // Recursively compute myPow(x, -n) for negative exponents
		            return 1.0 / myPow(x, -n);
		        }
		    }
		    
		    double result = 1.0;
		    while (n > 0) {
		        if (n % 2 == 1) {
		            result *= x;
		        }
		        x *= x;
		        n /= 2;
		    }
		    return result;
	}

}
