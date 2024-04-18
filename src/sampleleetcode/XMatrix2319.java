package sampleleetcode;

public class XMatrix2319 {

	public static void main(String[] args) {
		int[][] matrixArr = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };
		System.out.println(checkXMatrix(matrixArr));

	}

	public static boolean checkXMatrix(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid.length != grid[i].length) {
					return false;
				}
				if(i == j && grid[i][j] == 0 ) {
					return false;
				} else if( i!=j) {
					if( grid[i][grid[i].length -i-1] == 0 ) {
						return false;
				} else if(j!= grid[i].length -i-1 && grid[i][j] != 0)
					return false;
					
				} 
			}
		}

		return true;

	}

}
