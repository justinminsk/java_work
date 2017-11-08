import java.util.Scanner;

public class PokemonGame1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice, hp, search, potTotal, hp2, type, hold;
		double successRate;
		String type1;
		System.out.println("Pick your starter");
		System.out.println("Chimchar");
		System.out.println("Squirtle");
		System.out.println("Bulbasaur");
		final String starter = scan.next();
		potTotal = 10;
		hp = 100;
		do {
			search = (int) (Math.random() * (10 - 1) + 1);
			System.out.println("Do you want to: ");
			System.out.println("1. Search for pokemon");
			System.out.println("2. Use a potion");
			System.out.println("3. quit");
			choice = scan.nextInt();
			if (choice == 2) {
				hp += 20;
				potTotal--;
				System.out.println("Total potions: " + potTotal + " " + starter + " hp: " + hp);
			}
			if (choice == 1) {
				if (search >= 6)
					System.out.println("Search found nothing");
				else {
					System.out.println("You found a pokemon");
					hp2 = (int) (Math.random() * (50 - 20 + 20));
					type = (int) (Math.random() * (3 - 1) + 1);
					do {
						switch (type) {
						case 1:
							type1 = "grass";
							break;
						case 2:
							type1 = "water";
							break;
						case 3:
							type1 = "fire";
							break;
						}

						System.out.println("Do you (1)fight, (2)use a pokeball, (3)use a potion, (4)flee");
						switch (choice = scan.nextInt()) {
						case 1:
							hp -= 8;
							hp2 -= 5;
							System.out.println("your pokemons " + starter + " hp: " + hp + " wild pokemons hp: " + hp2);
							break;
						case 3:
							hp += 18;
							potTotal--;
							System.out.println("your pokemons " + starter + " hp: " + hp + " wild pokemons hp: " + hp2);
							System.out.println("Total potions: " + potTotal);
							break;
						case 2:
							successRate = hp2 / hp;
							hold = (int) (Math.random() * (10 - 1) + 1);
							if (hold > successRate) {
								System.out.println("pokemon caught");
								hp2 = 0;
								break;
							} else {
								System.out.println("did not catch");
								hp -= 2;
								break;
							}
						case 4:
							System.out.println("you flee");
							hp2 = 0;
							break;
						}
					} while (hp2 > 0 && hp > 0);
				}
			}
		} while (choice != 3 && hp > 0);
		System.out.println("Thank you for playing");
	}
}
