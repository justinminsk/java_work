/**
 * @author justin minsk
 * @version[4/5/2017]
 * 8.4
 * compute the weekly hours for each employee
 */
import java.util.Scanner;

public class computeTheWeeklyHoursForEachEmployee8_4 {
	public static double sumRow(double[][] m, int rowIndex) {
		double sum = 0;
		for (int i = 0; i < 7; i++) {
			sum += m[rowIndex][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] hours = { { 2, 3, 4, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 5, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		double[] sumHours = { sumRow(hours, 0), sumRow(hours, 1), sumRow(hours, 2), sumRow(hours, 3), sumRow(hours, 4),
				sumRow(hours, 5), sumRow(hours, 6) };
		double[] index = new double[7];
		for (int i = 0; i < 7; i++)
			index[i] = i;
		double temp = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (sumHours[j] > sumHours[i]) {
					temp = sumHours[i];
					sumHours[i] = sumHours[j];
					sumHours[j] = temp;
					temp = index[i];
					index[i] = index[j];
					index[j] = temp;
				}
			}
		}
		for (int i = 0; i < 7; i++)
			System.out.println("Employee " + index[i] + " worked a total of " + sumHours[i] + " hours");
	}
}
