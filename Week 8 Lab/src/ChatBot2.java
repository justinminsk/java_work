
public class ChatBot2 {
	public static boolean getResponse(String input) {
		if (input.contains("I want to buy")) {
			System.out.println("Would you be happy if you had " + input.substring("I want to buy ".length()) + "?");
			return false;
		} else if (input.contains("I want")) {
			System.out.println("Do you want " + input.substring("I want ".length()) + "?");
			return false;
		} else if (input.contains("I like to")) {
			System.out.println("Why do you like to " + input.substring("I like to ".length()) + "?");
			return false;
		} else {
			// System.out.println(getResponse2("dhoujsfk ber bafna;es" +
			// input));
			boolean ans = getResponse2(input);
			if (ans) {

				if (getResponse3(input))
					
				return false;
			}
			if (!ans) {
				return false;
			}
		}
		return true;
	}

	public static boolean getResponse2(String input) {
		if (input.contains("I hate")) {
			System.out.println("Are you sure you hate  " + input.substring("I Hate ".length()) + "?");
			return false;
		}
		return true;
	}

	public static boolean getResponse3(String input) {
		if (input.contains("I like")) {
			System.out.println("Are you sure you like  " + input.substring("I like ".length()) + "?");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Chat to chat bot");
		int end = 1;
		do {
			String userAnswer = input.nextLine();

			// getResponse(userAnswer);
			if (getResponse(userAnswer)) {
				int answerNum = (int) (Math.random() * (5 - 1) + 1);
				if (answerNum == 1)
					System.out.println("You suck!");
				if (answerNum == 2)
					System.out.println("Go away");
				if (answerNum == 3)
					System.out.println("What?");
				if (answerNum == 4)
					System.out.println("Why?");
				if (answerNum == 5)
					System.out.println("How?");
			}
		} while (end == 1);
	}
}
