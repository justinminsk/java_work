
/**
 * @author justin minsk
 * @version [3/29/2017]
 */
import java.util.Arrays;

public class program7_1 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// gets the size of the list
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		// creates list or array
		double[] numbers = new double[n];
		System.out.print("Enter the numbers: ");
		// loops until all n slots are filled in the list
		for (int i = 0; i < n; i++) {
			// adds the inputs to the list
			numbers[i] = input.nextDouble();
			// increases sum by each entry
		}
		double temp[] = new double[n];
		temp = numbers;
		Arrays.sort(temp);
		double best = temp[n - 1];
		for (int o = 0; o < n; o++) {
			if (numbers[o] >= best - 10)
				System.out.println("Student " + o + " score is " + numbers[o] + " and grade is A");
			else if (numbers[o] >= best - 20)
				System.out.println("Student " + o + " score is " + numbers[o] + " and grade is B");
			else if (numbers[o] >= best - 30)
				System.out.println("Student " + o + " score is " + numbers[o] + " and grade is C");
			else if (numbers[o] >= best - 40)
				System.out.println("Student " + o + " score is " + numbers[o] + " and grade is D");
			else
				System.out.println("Student " + o + " score is " + numbers[o] + " and grade is F");
		}

	}
}
