import java.util.Scanner;

public class ExitLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in exit");
		// user input
		String input;
		//can I use this ?
		String all = "";
		while (!(input = scan.next()).equals("exit"))
			all += " " + input;
		System.out.println(all);
	}
}
