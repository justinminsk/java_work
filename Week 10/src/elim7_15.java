import java.util.Arrays;

public class elim7_15 {
	public static int[] eliminateDuplicates(int[] arr) {

		int end = arr.length;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (arr[i] == arr[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						arr[shiftLeft] = arr[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] temp = new int[end];
		for (int i = 0; i < end; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] numbers = new int[10];
		System.out.print("Enter the numbers: ");
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(eliminateDuplicates(numbers)));
	}
}
