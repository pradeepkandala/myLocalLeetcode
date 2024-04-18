package sampleleetcode;

public class MaxWealthOfCustomer {

	public static void main(String[] args) {
		int wealthiest = maximumWealth(new int[][]{{1,5},{7,3},{3,5}});
		System.out.println(wealthiest);

	}

	public static int maximumWealth(int[][] accounts) {
		int maxSum = 0;
		
		for(int i=0;i<accounts[i].length;i++) {
			int sum=0;
			for(int j=0;j<accounts[j].length;j++) {
				sum=sum+accounts[i][j];
			}
			if(maxSum < sum)
				maxSum = sum;
		}
		return maxSum;
	}
}
