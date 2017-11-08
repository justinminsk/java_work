
public class buildIMG {
	public static void main(String[] args) {
		int[][][] matrix = new int[100][100][3];
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
					matrix[i][j][1] = (int) (Math.random() * 125);
			}
		}
		ImageBuilder imageBuilder = new ImageBuilder(matrix, 10);
		imageBuilder.show();
	}
}
