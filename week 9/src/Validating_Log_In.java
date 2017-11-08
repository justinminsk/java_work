import java.io.*;

public class Validating_Log_In {
	public static int username() throws IOException {
		System.out.println("Enter username");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String username = scan.nextLine();
		int x = -1;
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader("usernames.txt"));
		String line = br.readLine();
		while (line != null) {
			String usernameCheck = line;
			line = br.readLine();
			if (usernameCheck.contains(username)) {
				x = count;
				break;
			}
			count += 1;
		}
		return x;
	}

	public static boolean password(int z) throws IOException {
		int count = 0;
		boolean x = false;
		System.out.println("Enter password");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String password = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader("password.txt"));
		String line = br.readLine();
		while (line != null) {
			String passwordCheck = line;
			line = br.readLine();
			if (count == z) {
				if (passwordCheck.contains(password)) {
					x = true;
				}
				break;
			}
			count += 1;
		}
		return x;
	}

	public static void main(String[] args) throws IOException {
		boolean x = false;
		x = password(username());
		if ( x == true)
			System.out.println("correct username password configuration");
		else
			System.out.println("wrong password or username");

	}
}
