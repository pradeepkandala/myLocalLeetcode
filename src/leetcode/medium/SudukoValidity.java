package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SudukoValidity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			List<Character> ch = new ArrayList<>();
			for (int j = 0; j < 9; j++) {

				if (board[i][j] != '.') {
					if (!ch.contains(board[i][j]))
						ch.add(board[i][j]);
					else
						return false;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			List<Character> ch = new ArrayList<>();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					if (!ch.contains(board[j][i]))
						ch.add(board[j][i]);
					else
						return false;
				}
			}
		}

		for (int z = 0; z < 9; z = z + 3) {
			for (int x = 0; x < 9; x = x + 3) {
				List<Character> ch = new ArrayList<>();
				for (int i = z; i < z + 3; i++) {
					for (int j = x; j < x + 3; j++) {

						if (board[i][j] != '.') {
							if (!ch.contains(board[i][j]))
								ch.add(board[i][j]);
							else
								return false;
						}
					}
				}
			}
		}

		return true;
	}

}
