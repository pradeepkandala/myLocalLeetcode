package sampleleetcode;


public class SumOfDigitsOfBaseK {

	public static void main(String[] args) {

		int sum = sumBase(68,2);
		System.out.println(sum);
	}

	private static int sumBase(int n, int k) {
		StringBuffer sb=new StringBuffer();
		
		while(n>=k) {
			sb=sb.append(n%k);
			n=n/k;
		}
		sb.append(n);
		sb= sb.reverse();
		System.out.println(sb.toString());
	    int value=Integer.parseInt(sb.toString());
						
		int sum = sumNumbers(value);
		return sum;

	}

	private static int sumNumbers(int i) {
		int sum=0;
		while(i>0) {
			sum=sum+i%10;
			i=i/10;
		}
		return sum;
	}

}
