
public class Fractions {
	public static int factors(int number) {
		int n = 0;
		int x = 1;
		double[] list = new double[n];
		for (int divisor = 1; divisor <= number; divisor++) {
			if (number % divisor == 0) {
				n++;
				list[x] = divisor;
			}
		}
		return x;

	}

	public static int great(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("enter numerator of first fraction");
		int Num1 = scan.nextInt();
		System.out.println("enter denominator of first fraction");
		int Den1 = scan.nextInt();
		System.out.println("enter numerator of second fraction");
		int Num2 = scan.nextInt();
		System.out.println("enter denominator of second fraction");
		int Den2 = scan.nextInt();
		Num1 = Num1 * Den2;
		Num2 = Num2 * Den1;
		int Den3 = Den1 * Den2;
		Num1 = Num1 + Num2;
		int Den4= great(Den1, Den2);
		while (Num1 % Den4  == 0) {
			Num1 = Num1 / Den4;
			Den3 = Den3 / Den4;
			Den4 = factors(Den3);
		}
		System.out.println(Num1 + "/" + Den3);
	}
}
