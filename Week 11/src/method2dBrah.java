import java.util.Scanner;

public class method2dBrah {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[5][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (Math.random() * (1000 - 1) + 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("highest: " + getHighest(array) + " Lowest: " + getLowest(array) + " Average: "
				+ getAverage(array) + " Above your number: " + getAbove(array, scan));
	}

	public static int getHighest(int[][] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > max)
					max = array[i][j];
			}
		}
		return max;
	}

	public static int getLowest(int[][] array) {
		int min = 1001;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] < min)
					min = array[i][j];
			}
		}
		return min;
	}

	public static double getAverage(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
			}
		}
		return sum / 30.0;
	}

	public static int getAbove(int[][] array, Scanner scan) {
		System.out.println("Enter a number 1- 1000");
		int count = 0;
		int input = scan.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > input)
					count++;
			}
		}
		return count;
	}
}
