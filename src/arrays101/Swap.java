package arrays101;

public class Swap {

	public static void main(String[] args) {
		swap(12,32);

	}

	private static void swap(int i, int j) {
	System.out.println("i = " +i+ " j = " +j);
	int temp = i;
	i=j;
	j=temp;
	
	System.out.println("i = " +i+ " j = " +j);
		
	}

}
