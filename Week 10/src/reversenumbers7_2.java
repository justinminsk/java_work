
public class reversenumbers7_2 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("enter a 10 digit number");
		int[] numbers = new int[10];
		System.out.print("Enter the numbers: ");
		// loops until all n slots are filled in the list
		for (int i = 0; i < 10; i++) {
			// adds the inputs to the list
			numbers[i] = input.nextInt();
			// increases sum by each entry
		}
		for (int u = 9; u >= 0; u--)
			System.out.print(numbers[u]);
	}

}

