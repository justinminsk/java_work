import java.util.Scanner;

/**
 * Loop Activity 2 - Assigned on Monday 02/20/2017
 *
 * Model II: Program #2 Specificiation Create a Java program that displays a
 * menu of your choice. The menu has to have at least 4 options with the last
 * one being the exit. If the user enters a wrong option, the menu has to
 * display "Wrong Choice! Try Again!" and display the menu again. When the user
 * enters the right choice, the option needs to be processed.
 *
 */

public class LoopActivity2_withDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice;
		do {
			displayMenu();
			choice = input.next().charAt(0);
			displayInputValidation(choice);
		} while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D' && choice != 'E');

		int x, y, z;
		z = 0;
		double a = 0;
		;
		System.out.println("Enter two integers: ");
		x = input.nextInt();
		y = input.nextInt();
		displayMessage(choice, x, y, z, a);
	} // end main

	static void displayMenu() {
		System.out.println("Calculator Menu -------");
		System.out.println("A. Add");
		System.out.println("B. Subtract");
		System.out.println("C. Multiply");
		System.out.println("D. Divide");
		System.out.println("E. Exit");

		System.out.print("Enter your choice >> ");

	}

	static void displayInputValidation(char choice) {
		if (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D' && choice != 'E')
			System.out.println("\nWrong Choice! Try Again!");
	}

	static void displayMessage(char choice, int x, int y, int z, double a) {
		switch (choice) {
		case 'A':
			z = x + y;
			System.out.println(z);
			break;
		case 'B':
			z = x - y;
			System.out.println(z);
			break;
		case 'C':
			z = x * y;
			System.out.println(z);
			break;
		case 'D':
			if (y != 0) {
				a = x / y;
				System.out.println(a);
			} else
				System.out.println("Error divide by Zero");
		default:
			System.out.println("Thankyou");
			break;
		}
	}
} // end class
