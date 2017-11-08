import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] grid = new String[3][3];
		int[][] index = new int[3][3];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = "*";
			}
		}
		while (hasSpace(grid) == true && winner(index) == false) {
			printGrid(grid);
			playerTurn(grid, "X", scan, index);
			printGrid(grid);
			playerTurn(grid, "Y", scan, index);
		}
		if (winner(index) == false)
			System.out.println("draw game");
		winner(index);
	}

	public static boolean hasSpace(String[][] grid) {
		boolean hasSpace = false;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == "*")
					hasSpace = true;
			}
		}
		return hasSpace;
	}

	public static void printGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void playerTurn(String[][] grid, String playerSymbol, Scanner scan, int[][] index) {
		int choice1 = 0;
		int choice2 = 0;
		boolean filled = false;
		if (hasSpace(grid) == true && winner(index) == false) {
			do {
				filled = false;
				System.out.println("which row (0-2) would you like to play in?");
				choice1 = scan.nextInt();
				System.out.println("which column (0-2) would you like to play in?");
				choice2 = scan.nextInt();
				if (grid[choice1][choice2] == "*") {
					grid[choice1][choice2] = playerSymbol;
					if (playerSymbol == "X")
						index[choice1][choice2] = 1;
					if (playerSymbol == "Y")
						index[choice1][choice2] = 5;
				} else {
					System.out.println("already filled");
					filled = true;
				}
			} while (filled == true);
		}
	}

	public static boolean winner(int[][] grid) {
		boolean winner = false;
		boolean player1 = false;
		boolean player2 = false;
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[i][0];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[i][1];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[i][2];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[0][i];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[1][i];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = 0;
		for (int i = 0; i < 3; i++) {
			temp += grid[2][i];
			if (temp == 3)
				player1 = true;
			if (temp == 15)
				player2 = true;
		}
		temp = grid[0][0] + grid[1][1] + grid[2][2];
		if (temp == 3)
			player1 = true;
		if (temp == 15)
			player2 = true;
		temp = grid[0][2] + grid[1][1] + grid[2][0];
		if (temp == 3)
			player1 = true;
		if (temp == 15)
			player2 = true;
		if (player1 == true) {
			winner = true;
			System.out.println("Player one Wins");
		}
		if (player2 == true) {
			winner = true;
			System.out.println("Player one Wins");
		}
		return winner;
	}
}
