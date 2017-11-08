import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[3][4];
		int input = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (j == 0) {
					System.out.println("Enter Student " + (i + 1) + " id");
					input = scan.nextInt();
				}
				if (j == 1) {
					System.out.println("Enter Student " + (i + 1) + " test 1");
					input = scan.nextInt();
				} else if (j == 2) {
					System.out.println("Enter Student " + (i + 1) + " test 2");
					input = scan.nextInt();
				} else if (j == 3) {
					System.out.println("Enter Student " + (i + 1) + " test 3");
					input = scan.nextInt();
				}
				array[i][j] = input;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("Highest grade for all tests is id number " + getHighest(array));
	}

	public static int getHighest(int[][] array) {
		int grade1 = 0;
		int grade2 = 0;
		int grade3 = 0;
		int id = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if (i == 0)
					grade1 += array[i][j];
				if (i == 1)
					grade2 += array[i][j];
				if (i == 2)
					grade3 += array[i][j];
				if (grade1 > grade2) {
					if (grade1 > grade3)
						id = 0;
					else if (grade1 < grade3)
						id = 2;
				}
			}
			if (grade2 > grade1) {
				if (grade2 > grade3)
					id = 1;
				else if (grade2 < grade3)
					id = 2;
			}
		}
		return array[id][0];
	}
}
