package leetcode.medium;

/*
 * Given an integer array queries and a positive integer intLength, return an array answer where answer[i] is 
 * either the queries[i]th smallest positive palindrome of length intLength or -1 if no such palindrome exists.

 * A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.*/
public class PalindromeWithFixedLength {

	public static void main(String[] args) {
		long[] results = kthPalindrome(new int[] { 1, 5, 10, 50, 100, 1000, 74848, 90000000, 1000000000, 999999999 },
				2);
		for (int i = 0; i < results.length; i++) {
			System.out.print(results[i] + "\t");
		}

	}

	public static long[] kthPalindrome(int[] queries, int intLength) {
		long[] arr = new long[queries.length];
		long nOPs = (long) Math.pow(10, (intLength+1)/2);
		System.out.println("number of Palindromes: " + nOPs);
		if (intLength == 1) {
			for (int i = 0; i < queries.length; i++) {
				if (queries[i] < 10 && queries[i] < nOPs)
					arr[i] = queries[i];
				else
					arr[i] = -1;
			}
			return arr;
		}

		long endLength = (long) Math.pow(10, intLength) - 1;

		if (intLength % 2 == 0) {

			for (int i = 0; i < queries.length; i++) {
				if (queries[i] <= nOPs) {
					int halfPow = intLength - (intLength / 2) - 1;
					long paliNumHalf = (long) Math.pow(10, halfPow) + queries[i] - 1;

					//String foundNum = findReverse(Long.toString(paliNumHalf));

					//long fullNum = Long.parseLong(Long.toString(paliNumHalf) + foundNum);
					long fullNum = findReverse(paliNumHalf);
					if (fullNum <= endLength)
						arr[i] = fullNum;
					else
						arr[i] = -1;
				} else
					arr[i] = -1;
			}
		} else {
			for (int i = 0; i < queries.length; i++) {
				if (queries[i] <= nOPs) {

					System.out.println("value of i: " + i);
					long midNum = (queries[i] - 1) % 10;

					int halfPow = (intLength / 2);

					long paliNumHalf = (long) Math.pow(10, halfPow - 1) + ((queries[i] - 1) / 10);
					
					//String foundNum = findReverse(Long.toString(paliNumHalf));

					//long fullNum = Long.parseLong(Long.toString(paliNumHalf) + Long.toString(midNum) + foundNum);
					long fullNum = findReverse(paliNumHalf);
					if (fullNum <= endLength && queries[i] < nOPs)
						arr[i] = fullNum;
					else
						arr[i] = -1;
				} else
					arr[i] = -1;
			}
		}

		return arr;
	}
	
	private static long findReverse(long num) {
		long finalNum=num;
		while(num>0) {
			finalNum = (finalNum+(num%10))*10;
			num=num/10;
		}
		return finalNum;
	}

	private static String findReverse(String num) {
		char[] ar = num.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = num.length() - 1; i >= 0; i--) {
			sb.append(ar[i]);
		}

		return sb.toString();
	}
}
