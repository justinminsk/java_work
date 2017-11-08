/**
 * 
 * @author justin minsk
 * @version [3/3/207]
 * calculator that adds, subtracts, multiply, divide, average, varance, standard devation
 *
 */
public class Calc_8 {
	public static double add(double num1, double num2, double num3) {
		num3 = num1 + num2;
		System.out.println(num3);
		return num3;
	}

	public static double subt(double num1, double num2, double num3) {
		num3 = num1 - num2;
		System.out.println(num3);
		return num3;
	}

	public static double multi(double num1, double num2, double num3) {
		num3 = num1 * num2;
		System.out.println(num3);
		return num3;
	}

	public static double divs(double num1, double num2, double num3) {
		num3 = num1 / num2;
		System.out.println(num3);
		return num3;
	}

	public static double ave(double num1, double num2, double num3) {
		num3 = (num1 + num2) / 2;
		System.out.println(num3);
		return num3;
	}

	public static double var(double num1, double num2, double num3) {
		num3 = Math.pow(num1, 2) + Math.pow(num2, 2) - ((num1 + num2) / 2);
		System.out.println(num3);
		return num3;
	}

	public static double std(double num1, double num2, double num3) {
		num3 = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2) - ((num1 + num2) / 2));
		System.out.println(num3);
		return num3;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter your first number");
		double num_1 = input.nextDouble();
		System.out.println("Enter your second number");
		double num_2 = input.nextDouble();
		int choice;
		double ans = 0;
		do {
			System.out.println("What operation would you like to perform?");
			System.out.println("1.add");
			System.out.println("2. subtract");
			System.out.println("3. multiply");
			System.out.println("4 divide");
			System.out.println("5. average");
			System.out.println("6. variance");
			System.out.println("7. standard devation");
			System.out.println("8. exit");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				add(num_1, num_2, ans);
				break;
			case 2:
				subt(num_1, num_2, ans);
				break;
			case 3:
				multi(num_1, num_2, ans);
				break;
			case 4:
				if (num_2 != 0) {
					divs(num_1, num_2, ans);
				} else
					System.out.println("Error canot divide by 0");
				break;
			case 5:
				ave(num_1, num_2, ans);
				break;
			case 6:
				var(num_1, num_2, ans);
				break;
			case 7:
				std(num_1, num_2, ans);
				break;
			}
		} while (choice != 8);
		System.out.println("end");
	}
}
