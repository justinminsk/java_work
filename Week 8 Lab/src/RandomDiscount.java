/**
 * Discount Randomizer 1/27/2017
 * 
 * @author Justin Minsk
 *
 *         welcome set y and x if x>4.5 25% discount or y=.25 else 20% discount
 *         or y=.2 y% is your discount
 */
public class RandomDiscount {
	public static void main(String[] args) {
		System.out.println("Welcome to the resturant!");
		System.out.println("Flipping coin to find discount amount.");
		System.out.println(calculateFinalPrice(calculateDiscount()) + "% off is your discount!");
	}

	public static double calculateDiscount() {
		double x = (Math.random() * 10);
		double y = 1;
		if (x > 4.5) {
			System.out.println("Heads!");
			y = 0.25;
		} else {
			System.out.println("Tails!");
			y = 0.20;
		}
		return y;
	}

	public static double calculateFinalPrice(double y) {
		double disc = y * 100;
		return disc;
	}
}
