
public class three_ops {
	public static double getAverage(double num1, double num2, double num3) {
		double num4 = (num1 + num2 + num3) / 3;
		return num4;
	}

	public static double getHighest(double num1, double num2, double num3) {
		double ans = 1;
		if (num1 > num2) {
			if (num1 > num2)
				ans = num1;
			if (num3 > num1)
				ans = num3;
		}
		if (num2 > num1) {
			if (num2 > num3)
				ans = num2;
			if (num3 > num2)
				ans = num3;
		}
		return ans;
	}

	public static double getLowest(double num1, double num2, double num3) {
		double ans = 1;
		if (num1 < num2) {
			if (num1 < num2)
				ans = num1;
			if (num3 < num1)
				ans = num3;
		}
		if (num2 < num1) {
			if (num2 < num3)
				ans = num2;
			if (num3 < num2)
				ans = num3;
		}
		return ans;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter Grade 1");
		double grade1 = input.nextDouble();
		System.out.println("Enter Grade 2");
		double grade2 = input.nextDouble();
		System.out.println("Enter Grade 3");
		double grade3 = input.nextDouble();
		System.out.println("The highest is " + getHighest(grade1, grade2, grade3));
		System.out.println("The lowest is " + getLowest(grade1, grade2, grade3));
		System.out.println("The average is " + getAverage(grade1, grade2, grade3));
	}
}
