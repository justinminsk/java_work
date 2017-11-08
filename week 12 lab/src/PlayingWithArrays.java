import java.util.Arrays;

public class PlayingWithArrays {
	public static void main(String[] args) {
		int sum = 0;
		int[] intArray = new int[50];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * (1000 - 1) + 1);
			sum += intArray[i];
		}
		getHighest(intArray);
		getLowest(intArray);
		getAverage(sum);
		getAboveAverage(intArray, sum);
		getBelowAverage(intArray, sum);
	}

	public static void getHighest(int[] array) {
		Arrays.sort(array);
		System.out.println(array[49]);
	}

	public static void getLowest(int[] array) {
		Arrays.sort(array);
		System.out.println(array[0]);
	}

	public static void getAverage(int x) {
		int i = x / 50;
		System.out.println(i);
	}

	public static void getAboveAverage(int[] array, int x) {
		int j = x / 50;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > j)
				System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}

	public static void getBelowAverage(int[] array, int x) {
		int j = x / 50;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < j)
				System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}
}
