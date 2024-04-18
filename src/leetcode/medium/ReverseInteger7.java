package leetcode.medium;

public class ReverseInteger7 {

	public static void main(String[] args) {

		int num = reverse(1534236469);
		System.out.println(num);
		
	}

	public static int reverse(int x) {
		Long rev = 0l;
		double min = Math.pow(2, 31) * -1;
		double max = Math.pow(2, 31)-1;
			
		
		boolean negativeNumber =false;
		
		if(x<0) {
			negativeNumber = true;
			x=x*-1;
		}
			
		
		while(x>0) {
			rev = rev*10 + x%10;
			x=x/10;
		}
		
		if(rev < min || rev > max) {
			return 0;
		}
		
		if(negativeNumber)
			rev=rev*-1;
		
		return rev.intValue();

	}

}
