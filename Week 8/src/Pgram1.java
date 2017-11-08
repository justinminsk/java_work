
public class Pgram1 {
	public static void main(String[] args) {
		int x = 7;
		int nine = 9;
		int i = 9;
		int g = 0;
		int d;
		System.out.println(nine + " * " + nine + " + " + x + " = 88");
		x--;
		g++;
		for (int z = 8; z > 1; z--) {
			i = i * 10 + (nine - g);
			d = i * nine + x;
			System.out.println(i + " * " + nine + " + " + x + " = " + d);
			x--;
			g++;
		}
	}
}
