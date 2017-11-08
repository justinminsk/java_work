
public class test {
	public static void main(String[] args) {
		char[][] ragged = new char[3][];
		ragged[0] = new char[5];
		ragged[1] = new char[9];
		ragged[2] = new char[12];
		int letter = 65;
		ragged[0][0] = (char) letter;
		for (int i = 0; i < ragged[0].length; i++) {
			ragged[0][i]= (char) letter;
			System.out.print(ragged[0][i] + " ");
			letter++;
		}
		System.out.println(" ");
		for (int i = 0; i < ragged[1].length; i++) {
			ragged[1][i]= (char) letter;
			System.out.print(ragged[1][i] + " ");
			letter++;
		}
		System.out.println(" ");
		for (int i = 0; i < ragged[2].length; i++) {
			ragged[2][i]= (char) letter;
			System.out.print(ragged[2][i] + " ");
			letter++;
		}
	}
}
