import java.util.Arrays;

public class SearchArray {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter length of the Array");
		int n = input.nextInt();
		int[] intArray = new int[n];
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = (int) (Math.random() * (n - 1) + 1);
		System.out.println("Enter a number between 1 and " + n);
		int num = 0;
		Boolean exists = false;
		num = input.nextInt();
		for (int i = 0; i < intArray.length; i++) {
			if (num == intArray[i]) {
				System.out.println("Interger is at index " + i);
				exists = true;
			}
		}
		if (exists == false)
			System.out.println("No element found");
		System.out.println(Arrays.toString(intArray));
	}
}
