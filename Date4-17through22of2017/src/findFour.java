
/**
 * @author justin Minsk
 * @version [4/19/2017]
 * table 10
 * 
 */
import java.util.Scanner;

public class findFour {
	public static void main(String[] args) {
		// scanner to read inputs
		Scanner input = new Scanner(System.in);
		// ask and declare number of rows in the array
		System.out.println("How many rows?");
		int rows = input.nextInt();
		// ask and declare number of columns in the array
		System.out.println("How many columns?");
		int columns = input.nextInt();
		// create the array
		int[][] array = new int[rows][columns];
		// fill the array with numbers 1-9
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) ((Math.random() * 9) + 1);
			}
		}
		// print the array by row
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		// display if it has four consecutive or not
		System.out.println("Has consecutive four: " + hasConsecutiveFour(array));
	}

	public static boolean hasConsecutiveFour(int[][] array) {
		// boolean to be returned
		boolean answer = false;
		// looks at all entries in the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				// if the next 4 diagonals are in bound
				if (j + 3 < array[0].length && i + 3 < array.length) {
					// check to see if they are the same
					if (array[i][j] == array[i + 1][j + 1] && array[i][j] == array[i + 2][j + 2]
							&& array[i][j] == array[i + 3][j + 3]) {
						// if they are switch answer to true
						answer = true;
					}
				}
				// if the next 4 diagonal are in bound looking at second type of
				// diagonal w/o ++ but ++ one and -- the other
				if (i + 3 < array.length && j - 3 >= 0) {
					// check if they are the same
					if (array[i][j] == array[i + 1][j - 1] && array[i][j] == array[i + 2][j - 2]
							&& array[i][j] == array[i + 3][j - 3]) {
						// if they are change answer to true
						answer = true;
					}
				}
				// if the next 4 entries in the row are in bound
				if (j + 3 < array[0].length) {
					// check to see if they are the same
					if (array[i][j] == array[i][j + 1] && array[i][j] == array[i][j + 2]
							&& array[i][j] == array[i][j + 3]) {
						// if they are change answer to true
						answer = true;
					}
				}
				// if the nest four entries in the row are in bound
				if (i + 3 < array.length) {
					// see if they are the same
					if (array[i][j] == array[i + 1][j] && array[i][j] == array[i + 2][j]
							&& array[i][j] == array[i + 3][j]) {
						// if they are change answer to true
						answer = true;
					}
				}
			}
		}
		// return true or false if there are four consecutive numbers in the
		// array or not
		return answer;
	}
}
