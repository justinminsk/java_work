
public class Stats {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("how many numbers in the list?");
		int n = scan.nextInt();
		double sum = 0;
		double sumSqr = 0;
		double[] list = new double[n];
		System.out.println("Enter the numbers");
		for (int x = 0; x < n; x++) {
			list[x] = scan.nextDouble();
			sum += list[x];
			sumSqr += Math.pow(list[x], 2);
		}
		System.out.println("Sum of x's " + sum);
		double ave = sum / n;
		System.out.println("Ave of x's " + ave);
		double var = (sumSqr - (Math.pow(sum, 2) / n)) / (n - 1);
		double std = Math.sqrt(var);
		System.out.println("Std Dev " + std);
		System.out.println("Variance " + var);
		char choice;
		do {
			System.out.println("Do you want to find a z value? Y/N");
			System.out.println("stop finding z with E");
			choice = scan.next().charAt(0);
			if (choice == 'Y') {
				zScore(ave, std);
			} else
				System.out.println("E to exit");
		} while (choice != 'E');
	}

	public static void zScore(double average, double Standard) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double z;
		double xHold;
		System.out.println("Enter x: ");
		xHold = input.nextDouble();
		z = (xHold - average) / Standard;
		System.out.println(z);
	}
}
