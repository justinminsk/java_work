/**
 * 
 * @author justi 
 * x = 1 
 * x = 1* 10 + 1 
 * z= x*x
 */
public class prg2 {
	public static void main(String[] args) {
		long x = 1;
		long z = 0;
		for (int y = 0; y <= 9; y++) {
			z = x * x;
			System.out.println(x + " * " + x + " = " + z);
			x = x * 10 + 1;
		}
	}
}
