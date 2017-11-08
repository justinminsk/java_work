

public class Array2D {
	public static void main(String[] args) {
		int[][] array = new int[4][5];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (int) (Math.random() * (10 - 1) + 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}
