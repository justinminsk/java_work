import java.util.Arrays;

public class scores7_4 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int i, sum = 0, n = 0;
		double[] numbers = new double[100];
		do {
			i = input.nextInt();
			numbers[n] = i;
			n++;
			sum += i;
		} while (i > 0);
		double[] numbers_New = new double[n - 1];
		numbers_New = Arrays.copyOfRange(numbers, 0, n - 1);
		double ave = sum / (n - 1.0);
		int count1 = 0, count2 = 0;
		for (i = 0; i < n - 1; i++) {
			if (numbers_New[i] >= ave)
				count1++;
			else
				count2++;
		}
		System.out.println("average is "+ave);
		System.out.println("Numbers above or equal to average = " + count1 + " below = " + count2);
		System.out.println(Arrays.toString(numbers_New));
	}
}
