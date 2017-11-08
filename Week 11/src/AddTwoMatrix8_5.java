/**
 * @author justin minsk
 * @version [4/5/2017]
 * 8.5
 * Add two Matrixes 
 */
import java.util.Scanner;

public class AddTwoMatrix8_5 {
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] sum = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix a");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Enter 3x3 matrix b");
		double[][] b = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" + ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" = ");
		double[][] sum = addMatrix(a, b);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
