import java.util.Scanner;

public class mutliTAbles {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scan.nextInt();
		System.out.println("Enter Columns");
		int columns = scan.nextInt();
		int[][] array = new int[rows][columns];
		int count1 = 1;
		int count2 = 2;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0) {
					array[i][j] = count1;
					count1++;
				} else if (j == 0) {
					array[i][j] = count2;
					count2++;
				} else
					array[i][j] = array[0][j] * array[i][0];
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
