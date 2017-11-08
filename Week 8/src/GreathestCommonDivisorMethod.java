
/**
 * @author justin minsk
 * @version [3/1/2017]
 * find the greatest common divisor between the two number
 */
import java.util.Scanner;

public class GreathestCommonDivisorMethod {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		// display the gcd using a method
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}

	/** Return the gcd of two integers */
	// int method to find gdc
	public static int gcd(int n1, int n2) {
		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd
		//loop to make sure that the highest common divisor canot be 
		//more than either number
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k; // Update gcd
			//add one to k
			k++;
		}

		return gcd; // Return gcd
	}
}
