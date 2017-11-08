
public class calc {
	public static void main(String[] args) {
		//declare answer 
		int answer;
		do {
			//call menu 
			menu();
			//make answer equal to an int
			answer = scanInt();
			//switch menu to read the answer and call the operation 
			switch (answer) {
			case 1:
				add();
				break;
			case 2:
				subt();
				break;
			case 3:
				mult();
				break;
			case 4:
				divDec();
				break;
			case 5:
				divInt();
				break;
			case 6:
				System.out.println("good bye");
				break;
			}
//stops when they quit
		} while (answer != 6);
	}

	public static void menu() {
		//list of all the commands
		System.out.println("----calculator----");
		System.out.println("1. add");
		System.out.println("2. subtract");
		System.out.println("3. multiply");
		System.out.println("4. decimal division");
		System.out.println("5. fraction division");
		System.out.println("6. quit");
	}

	public static int scanInt() {
		//scanner for int
		java.util.Scanner input = new java.util.Scanner(System.in);
		int u = input.nextInt();
		return u;
	}

	public static double scan() {
		//scanner for double
		java.util.Scanner input = new java.util.Scanner(System.in);
		double u = input.nextDouble();
		return u;
	}

	public static void add() {
		//ask for numbers and record them to x and z
		System.out.println("enter first number");
		double x = scan();
		System.out.println("enter second number");
		double z = scan();
		//add the numbers together and give an answer
		System.out.println(x + "+" + z + "=" + (x + z));
	}

	public static void subt() {
		System.out.println("enter first number");
		double x = scan();
		System.out.println("enter second number");
		double z = scan();
		System.out.println(x + "-" + z + "=" + (x - z));
	}

	public static void mult() {
		System.out.println("enter first number");
		double x = scan();
		System.out.println("enter second number");
		double z = scan();
		System.out.println(x + "*" + z + "=" + (x * z));
	}

	public static void divDec() {
		System.out.println("enter first number");
		double x = scan();
		System.out.println("enter second number");
		double z = scan();
		if (z != 0)
			System.out.println(x + "/" + z + "=" + (x / z));
		else
			System.out.println("error, cannot divide by zero");
	}

	public static void divInt() {
		System.out.println("enter first number");
		int x = scanInt();
		System.out.println("enter second number");
		int z = scanInt();
		if (z != 0)
			if (x / z == 0)
				System.out.println(x + "/" + z + "=" + (x % z) + "/" + z);
			else
				System.out.println(x + "/" + z + "=" + (x / z) + " " + (x % z) + "/" + z);
		else
			System.out.println("error, cannot divide by zero");
	}
}
