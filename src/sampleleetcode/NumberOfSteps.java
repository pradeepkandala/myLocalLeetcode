package sampleleetcode;

public class NumberOfSteps {

	public static void main(String[] args) {
		int numberOfSteps = numberOfSteps(500);
		System.out.println(numberOfSteps);

	}

	public static int numberOfSteps(int num) {
		int steps=0;
		while(num>0) {
			if(num%2==0) {
				steps++;
				num=num/2;
			} else {
				num=num-1;
				steps++;
			}
		}

		return steps;
	}

}
