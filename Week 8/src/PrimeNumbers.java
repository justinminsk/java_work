
/**
 * @author justin minsk
 * @version [3/1/2017]
 * user inputs a number
 * program looks at ever integer between 0 and that number
 * and states if each one is prime or not
 * 
 *  boolean method Prime
 * boolean isPrime = true
 * divisor starts at 2 and increases by one each loop
 * until divisor is equal to half of the number entered
 * if number% divisor = 0
 * isPrime = false
 * return isPrime
 * void method question
 * asks for integer
 * set up scanner
 * do 
 * question
 * user input
 * inputHold = user input
 * input = input- input +1
 * while input is less than or equal to inputHold
 * if Prime(input) is true
 * is prime 
 * else is not
 * while user input is not -1
 */
import java.util.Scanner;

public class PrimeNumbers {
	public static boolean Prime(int number) {
		boolean isPrime = true;
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void question() {
		System.out.println("Enter an integer: ");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int inputHold = 0;
		do {
			question();
			input = scan.nextInt();
			inputHold = input;
			input = input - input + 1;
			while (input <= inputHold) {
				if (Prime(input))
					System.out.println(input + " is prime");
				else
					System.out.println(input + " is not prime");
				input++;
			}
		} while (input != -1);
	}
}
