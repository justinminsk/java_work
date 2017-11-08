/**
 * @author justin minsk
 * @version[4/5/2017]
 * 8.1 sum elements column by column
 */
import java.util.Scanner;

public class SumCulmn8_1 {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		for (int i = 0; i < 4; i++){
			System.out.println("The sum of column"+i+" is "+ sumColumn(m, i));
		}
	}
}
