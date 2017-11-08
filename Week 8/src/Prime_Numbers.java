/**
 * @author justin minsk
 * @version [3/1/2017]
 * user inputed numbers are told if they are prime or not 
 * until user enters -1
 * 
 * boolean method Prime
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
 * if Prime(input) is true
 * is prime 
 * else is not
 * while user input is not -1
 */
import java.util.Scanner;

public class Prime_Numbers {
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
		int input;
		do {
			question();
			input = scan.nextInt();
			if (Prime(input))
				System.out.println(input + " is prime");
			else
				System.out.println(input + " is not prime");
		} while (input != -1);
	}
}
