/**
 * 
 * @author justin minsk
 * @version [4/19/2017] table 10
 * 
 *          A program that randomly creates and displays a magic square. A magic
 *          square being a 3x3 matrix with all rows, columns, and diagonals
 *          equal to 15 only using the numbers 1-9.
 *
 *          _________________________Main method_________________________
 *          Initialize a 3x3 array and then call displayMagicSquare() method.
 *          _____________________displayMagicSquare method_____________________
 *          DO this- Call fillMatrix() method loop for each row and have a
 *          nested loop for each column that prints each entire row by row.
 *          Display if it is or is not a magic square. -Until isMagicSquare
 *          method is true. ________________________fill
 *          Matrixmethod________________________ Create a random number 1-9 as a
 *          temporary int temp. Create a loop with a nested loop that fills the
 *          array with 0's. While temp is not unique, using the isUnique method,
 *          change temp to be a new random number 1-9. Do this until all entries
 *          are filled 1-9 in the array. __________________________isUnique
 *          method__________________________ If the number checked against all
 *          entries of the array is the same as an entire in the array return
 *          false else return true. _______________________isMagicSqaure
 *          method_______________________ If the value of sumRows, sumColumns,
 *          and sumDiagonals methods are the same return true else return false.
 *          __________________________sumRows method__________________________
 *          Have three sums (sum1, sum2, sum3) and a boolean as an int sum. Add
 *          all three entries of each row. If sum2 and sum3 equal sum1 then
 *          return true else return false. _________________________sumColumns
 *          method_________________________ Have three sums (sum1, sum2, sum3)
 *          and a boolean as an int sum. Add all three entries of each Column.
 *          If sum2 and sum3 equal sum1 then return true else return false.
 *          ________________________sumDiagonals method________________________
 *          Have two sums (sum1, sum2) and a boolean as an int sum. Sum both
 *          diagonals and if they are the same return true else return false.
 */
public class Assignment_3 {
	public static void main(String[] args) {
		// Initialize a 3x3 array
		int[][] array = new int[3][3];
		// use method
		displayMagicSquare(array);
	}

	public static int sumRows(int[][] array) {
		// Initialize boolean and sums
		int sum = -1;
		int sum1 = 0, sum2 = 0, sum3 = 0;
		// sum row 1
		for (int i = 0; i < 3; i++) {
			sum1 += array[0][i];
		}
		// sum row 2
		for (int i = 0; i < 3; i++) {
			sum2 += array[1][i];
		}
		// sum row 3
		for (int i = 0; i < 3; i++) {
			sum3 += array[2][i];
		}
		// see if they all have the same sum
		if (sum1 == sum2 && sum1 == sum3)
			sum = 15;

		return sum;
	}

	public static int sumColumns(int[][] array) {
		// Initialize boolean and sums
		int sum = -1;
		int sum1 = 0, sum2 = 0, sum3 = 0;
		// sum column 1
		for (int i = 0; i < 3; i++) {
			sum1 += array[i][0];
		}
		// sum column 2
		for (int i = 0; i < 3; i++) {
			sum2 += array[i][1];
		}
		// sum column 3
		for (int i = 0; i < 3; i++) {
			sum3 += array[i][2];
		}
		// if they all have the same sum
		if (sum1 == sum2 && sum1 == sum3)
			sum = 15;

		return sum;
	}

	public static int sumDiagonals(int[][] array) {
		// Initialize boolean and sums
		int sum = -1;
		// sum diagonal 1
		int sum1 = array[0][0] + array[1][1] + array[2][2];
		// sum diagonal 2
		int sum2 = array[2][0] + array[1][1] + array[0][2];
		// if they are the same
		if (sum1 == sum2)
			sum = 15;
		return sum;
	}

	public static boolean isUnique(int[][] array, int num) {
		// Initialize boolean
		boolean unique = true;
		// look at each entire
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				// if the number equals any entire
				if (num == array[i][j]) {
					unique = false;
				}
			}
		}
		return unique;
	}

	public static void displayMagicSquare(int[][] array) {
		do {
			// call method
			fillMatrix(array);
			// for each entire
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					// print line spaced by one space
					System.out.print(array[i][j] + " ");
				}
				// starts next row
				System.out.println(" ");
			}
			// if method is false
			if (isMagicSquare(array) == false) {
				System.out.println("sum of Rows: " + sumRows(array));
				System.out.println("sum of Columns: " + sumColumns(array));
				System.out.println("sum of Diagonals: " + sumDiagonals(array));
				System.out.println("Is not a Magic Square");
			}
			// if method is true
			if (isMagicSquare(array) == true) {
				System.out.println("sum of Rows: " + sumRows(array));
				System.out.println("sum of Columns: " + sumColumns(array));
				System.out.println("sum of Diagonals: " + sumDiagonals(array));
				System.out.println("Is a Magic Square");
			}
			// while the method is false
		} while (isMagicSquare(array) == false);
	}

	public static void fillMatrix(int[][] array) {
		// Initialize temp as a random number 1-9
		int temp = (int) (Math.random() * (9) + 1);
		// for all entire in the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				// set them to 0
				array[i][j] = 0;
			}
		}
		// for all entire in the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				do {
					// make temp a random number 1-9
					temp = (int) (Math.random() * (9) + 1);
					// while the method is false
				} while (isUnique(array, temp) == false);
				// assign position (i,j) to temp
				array[i][j] = temp;
			}
		}

	}

	public static boolean isMagicSquare(int[][] array) {
		// Initialize boolean and sums
		boolean fact = false;
		// if all the methods return true
		if (sumColumns(array) == 15 && sumRows(array) == 15 && sumDiagonals(array) == 15)
			fact = true;
		return fact;
	}
}
