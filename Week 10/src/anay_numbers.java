/**
 * 
 * @author justin minsk
 * @version [3/29/2017]
 * 
 *          Creates a list finds the sum uses that to find the average with
 *          sum/n (number of numbers). Then goes through each number and sees if
 *          it is greater than the average using a count++ to keep track of how
 *          many numbers are above average then displays numbers over average
 *          and the average.
 * 
 *
 */
public class anay_numbers {

	public static void main(String[] args) {
		// create scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// gets the size of the list
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		// creates list or array
		double[] numbers = new double[n];
		// creates sum variable
		double sum = 0;
		// has the user enter all of the numbers
		System.out.print("Enter the numbers: ");
		// loops until all n slots are filled in the list
		for (int i = 0; i < n; i++) {
			// adds the inputs to the list
			numbers[i] = input.nextDouble();
			// increases sum by each entry
			sum += numbers[i];
		}
		// creates the average
		double average = sum / n;
		// creates count
		int count = 0;
		// The number of elements above average
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;
		// displays average and numbers greater then average
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
	}
}
