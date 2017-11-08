
public class WannabeWar {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] cardRank = new int[52];
		for (int i = 0; i < cardRank.length; i++)
			cardRank[i] = i;
		String[] suit = { "Hearts", "Clubs", "Diamonds", "Spades" };
		String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] deck = new String[52];
		for (int i = 0; i < deck.length;) {
			for (int j = 0; j < 14; i++, j++) {
				if (j == 13)
					j = 0;
				if (i < 13)
					deck[i] = rank[j] + " of " + suit[0];
				if (i > 12 && i < 26)
					deck[i] = rank[j] + " of " + suit[1];
				if (i > 25 && i < 39)
					deck[i] = rank[j] + " of " + suit[2];
				if (i > 38 && i < 51)
					deck[i] = rank[j] + " of " + suit[3];
				if (i == 51) {
					deck[i] = rank[j] + " of " + suit[3];
					j = 14;
				}
			}
		}
		int choice = 0;
		int cpu1Wins = 0;
		int cpu2Wins = 0;
		int o = (int) (Math.random() * (51));
		int j = (int) (Math.random() * (51));
		do {
			System.out.println("You play (1) or CPU's play (2) or quit (3)");
			choice = input.nextInt();
			if (choice == 1) {
				shuffle(deck, cardRank);
				System.out.println("Enter an index. (0-51)");
				j = input.nextInt();
				int i = (int) (Math.random() * (51));
				if (cardRank[i] > cardRank[j])
					System.out.println("CPU beats your " + deck[j] + " with a " + deck[i]);
				else
					System.out.println("You beat the CPU with a " + deck[i] + " with a " + deck[j]);
			} else if (choice == 2) {
				for (int i = 0; i < 101; i++) {
					shuffle(deck, cardRank);
					o = (int) (Math.random() * (51 - 25) + 25);
					j = (int) (Math.random() * (25 - 1) + 1);
					if (cardRank[o] > cardRank[j])
						cpu1Wins++;
					else if (cardRank[j] > cardRank[o])
						cpu2Wins++;
				}
				if (cpu1Wins > cpu2Wins)
					System.out.println("CPU 1 wins with " + cpu1Wins + " wins");
				else if (cpu2Wins > cpu1Wins)
					System.out.println("CPU 2 wins with " + cpu2Wins + " wins");
				else
					System.out.println("Draw " + cpu1Wins + " " + cpu2Wins);
			}
		} while (choice != 3);
	}

	public static void shuffle(String[] deck, int[] card) {
		String temp = "";
		int temp2 = 0;
		for (int p = 0; p < 101; p++) {
			int i = (int) (Math.random() * (51));
			int o = (int) (Math.random() * (51));
			System.out.println(o);
			temp = deck[i];
			deck[i] = deck[o];
			temp = deck[o];
			temp2 = card[i];
			card[i] = card[o];
			temp2 = card[o];
		}
		System.out.println(temp2);
	}

}
