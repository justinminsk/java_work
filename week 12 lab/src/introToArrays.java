
public class introToArrays {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Enter an interger");
			intArray[i] = input.nextInt();
		}
		int j = 0;
		do {
			System.out.println("Enter index you wish to see (-1 to quit)");
			j = input.nextInt();
			if (j < 10 && j > -1)
				System.out.println(intArray[j]);
			else
				System.out.println("worng input");
		} while (j != -1);
	}
}
