
import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println(showArray(array));
		// What do you think it will be?
		int sum = fillArray(array);
		System.out.println(showArray(array));
		System.out.println("average is equal " + ave(sum));
		System.out.println("The max is " + max(array));
		System.out.println("The min is "+ min(array));
		// What do you think it will be?
	}
	public static String showArray(int[] array){
		Arrays.sort(array);
		return Arrays.toString(array);
	}

	public static int max(int[] array) {
		Arrays.sort(array);
		return array[4];
	}

	public static int min(int[] array) {
		Arrays.sort(array);
		return array[0];

	}

	private static int fillArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomInt(0, 5);
			sum += array[i];
		}
		return sum;
	}

	public static double ave(int summ) {
		double ave = summ / 5.0;
		return ave;
	}

	private static int getRandomInt(int a, int b) {
		int c = 0;
		c = (int) (Math.random() * (a - b) + b);
		// create a random number in
		// // the range a and b
		return c;
	}
}
