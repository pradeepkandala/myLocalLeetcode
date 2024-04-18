package arrays101;

public class DuplicateZeros {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j] == 0) {				
				for (int i = arr.length - 1; i > j; i--) {
					arr[i] = arr[i - 1];
				}	
				j++;
				arr[j] = 0;
			}
		}

	}

}
