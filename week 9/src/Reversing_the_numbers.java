
public class Reversing_the_numbers {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("enter a number");
		String number = scan.nextLine() + " ";
		int x = number.lastIndexOf(" ");
		String y = number.substring(0, x);
		int number2 = Integer.parseInt(y);
		String z;
		while (x != 0) {
			z = number.substring(x - 1, x);
			x = x - 1;
			System.out.print(z);
		}
		factors(number2);
	}

	public static void factors(int number) {
		int x = 0;
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				x = divisor;
			}
		}
		System.out.println(" ");
		System.out.println("Factors of " + number + " = " + x + "," + number / x);
	}
}
