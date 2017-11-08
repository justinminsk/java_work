/**
 * 
 * @author justin minsk
 * @version [3/29/2017]
 * 
 *          Creates a deck using three arrays suit, deck, and rank. Deck adds 52
 *          numbered entries 1-52. Creates a random index to shuffle the cards.
 *          Then pulls four cards and displays the card the nuber it is in the
 *          deck and the suit.
 * 
 *          for (int i = 0; i < 4; i++) { int cardNumber = (int)(Math.random() *
 *          deck.length); String suit = suits[cardNumber / 13]; String rank
 *          ranks[cardNumber % 13]; System.out.println("Card number " +
 *          cardNumber + ": " + rank + " of " + suit); } yes since Math.rand
 *          would still make a number 1-52 and the rank and suite would still
 *          index correctly .
 */
public class deck {
	public static void fillArray(int[] deck) {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;

		}
	}

	public static void displaycard(int i, int deck[], String[] suit, String[] rank) {
		for (i = 0; i < 1; i++) {

			String suits = suit[deck[i] / 13];
			String ranks = rank[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + ranks + " of " + suits);
		}
	}

	public static void shuffle(int deck[]) {
		for (int i = 0; i < deck.length; i++) {
			// Generate an index randomly
			int index = (int) (Math.random() * deck.length);
			// saves the normal deck 1-52
			int temp = deck[i];
			// shuffles"" deck
			deck[i] = deck[index];
			// saves the orignial deck 1-52 to deck[index]
			deck[index] = temp;
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] deck = new int[52];
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		System.out.println("Pick a card 0-51");
		// Initialize the cards
		fillArray(deck);
		displaycard(input.nextInt(), deck, suits, ranks);
		// Shuffle the cards
		shuffle(deck);
		System.out.println("Pick a card 0-51");
		displaycard(input.nextInt(), deck, suits, ranks);
		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			// draws the first four cards using the int of i/13 to find suite
			// and i%13
			// to find the rank since /13 can only be 0-3 and %13 can be 0-12
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}

}
