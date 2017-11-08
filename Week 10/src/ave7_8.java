
public class ave7_8 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] num = new int[10];
		double[] numbers = new double[10];
		System.out.print("Enter 10 numbers: ");
		// loops until all n slots are filled in the list
		for (int i = 0; i < 10; i++) {
			int user_input = input.nextInt();
			numbers[i] = user_input;
			num[i] = user_input;
		}
		System.out.println("int ave " + average(num));
		System.out.println("double ave " + average(numbers));
	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < 10; i++)
			sum += array[i];
		int ave = (sum / 10);
		return ave;
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < 10; i++)
			sum += array[i];
		double ave = sum / 10.0;
		return ave;
	}

}
