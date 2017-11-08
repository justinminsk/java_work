/**
 * @author justin minsk
 * @version[4/5/2017]
 * 8.2
 * Sum the major diagonal in a matrix 
 */
import java.util.Scanner;

public class sumTheMajorDiagonalinAMAtrix8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of Columns");
		int column = sc.nextInt();
		double[][] m = new double[rows][column];
		System.out.println("Enter a " + rows + " by " + column + " matrix row by row");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				m[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Sum = " + sumMajorDiagonal(m));
	}

	public static double sumMajorDiagonal(double[][] m) {
		int nextC = 0;
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][nextC];
			nextC++;
		}
		return sum;
	}
}
