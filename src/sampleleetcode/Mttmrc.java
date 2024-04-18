package sampleleetcode;

public class Mttmrc {

	public static void main(String[] args) {
		int min = minCost("abaac", new int[] { 1, 2, 3, 4, 5 });
		System.out.println(min);
	}

	public static int minCost(String colors, int[] neededTime) {
		char[] c = colors.toCharArray();
		int finalSum = 0;
		for (int i = 0; i < c.length - 1; i++) {
			int j = i + 1;
			int sum=neededTime[i];
			int max=neededTime[i];
			while (c[i] == c[j]) {
				
				if (max < neededTime[j]) {
					max = neededTime[j];
				}
				sum = sum + neededTime[j];
				j++;
			}
			sum=sum-max;
			finalSum = finalSum + sum;
			i = j - 1;

		}
		return finalSum;
	}

}
