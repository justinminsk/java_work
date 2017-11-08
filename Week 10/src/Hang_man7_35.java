import java.util.Arrays;

public class Hang_man7_35 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String[] words = { "", "Game", "Love", "Hate", "Fear" };
		do {
			int x = (int) (Math.random() * (4 - 1) + 1);
			int missed = 0;
			String word = words[x];
			char[] list = new char[word.length()];
			for (int i = 0; i < list.length; i++)
				list[i] = '*';
			do {
				System.out.println("(Guess) Enter a letter in word " + Arrays.toString(list));
				String choice = input.next();
				if (word.contains(choice)) {
					for (int i = 0; i < word.length(); i++) {
						if (choice.charAt(0) == word.charAt(i)) {
							if (choice.charAt(0) == list[i])
								System.out.println(choice + " is already in the word");
							else
								list[i] = choice.charAt(0);
						}
					}
				} else {
					System.out.println(choice + " is not in the word");
					missed++;
				}
			} while (list[0] == '*' || list[1] == '*' || list[2] == '*' || list[3] == '*');
			System.out.println("The word is " + words[x] + ". You missed " + missed + " time");
			System.out.println("do you want to guess another word? Enter y or n");
			missed = 0;
		} while (input.next().charAt(0) == 'y');
	}
}
