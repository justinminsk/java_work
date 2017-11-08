import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Date;

/**
 * @author justin minsk
 * @version [3/22/2017]
 * 
 *          A program that creates a expense and deposit spread sheet using a
 *          line reader and String tokenizer to read each line and break the
 *          line into multiple parts. Using loops and boolean expressions to be
 *          able to look at only expenses or deposits and months or days of a
 *          year. To be able to narrow down the amount of lines you are seeing.
 *          It also allows for a user to enter new lines using a file writer.
 *          This is all done in a loop menu that lets you continue to do tasks
 *          until 'Q' is entered to end the program.
 * 
 *          set up two methods to scan for a String and an int since we use
 *          these functions often. create the menu as a method to call instead
 *          of copying the many lines of code over and over. method optionA()
 *          ask the user if they want to log an expense or deposit save this
 *          input as choice declare varibles create the date format for the log
 *          M/d/yy make it so it take current day set up writer and printer
 ***          (this will be used many times and will be refered to as read
 *          lines)*** set up reader make each line a string make it so it breaks
 *          each line into 5 parts for each line (end)** if they want to log an
 *          expense let them know which expense they can log and take their
 *          response ask for amount print line to the .txt file if want to log
 *          deposits follow expense but with deposits instead the rest will use
 *          hte read lines code and then use if state meants with .contains or
 *          .startswith to only print out lines that are clarfiyed by the user
 *          option B looks at only expense option C looks at only deposits
 *          option D only looks at one month Option E looks only a t month and
 *          then either expense, deposits, or both of that month option F only
 *          looks at one day option G only looks at one days expense, deposits
 *          or both option H looks at a particular expense using the events
 *          string option I same as H but with Deposits option J is displaying
 *          the while list option Q exits the program this is run through a
 *          switch menu with a loop that only ends when Q is entered
 *
 * @author Devansh
 * @version 3/1/2017
 */
public class Assignment2 {
	// created a method to scan
	public static String scanS() {
		// scan and return a string
		java.util.Scanner input = new java.util.Scanner(System.in);
		String i = input.next();
		return i;
	}

	public static int scanI() {
		// scan and return a int
		java.util.Scanner input = new java.util.Scanner(System.in);
		int i = input.nextInt();
		return i;
	}
	// You can use a static scanner if you want or you can declare scanner in
	// individual methods.
	// Static Scanner is beneficial as it will save you time in declaring the
	// Scanner again and again

	public static char menu() {
		// the typed out menu
		System.out.println("Select one of the following options\n");
		System.out.println("A. Make a log");
		System.out.println("B. View all logs for my previous expenses");
		System.out.println("C. View all logs for deposits");
		System.out.println("D. View all logs for a particular month");
		System.out.println("E. View Customized logs for a particular month");
		System.out.println("F. View all logs for a particular day");
		System.out.println("G. View Customized logs for a particular day");
		System.out.println("H. View all logs for a particular previous expenses");
		System.out.println("I. View all logs for a particular previous deposits");
		System.out.println("J. View all logs till date");
		System.out.println("Q. Quit");
		// Write code that will return the user choice instead of Q
		// call scan and make it equal to the first char
		char choice;
		return choice = scanS().charAt(0);
	}

	public static void optionA() throws IOException {

		System.out.println("You chose to make a log. Please select one of the following option");
		System.out.println("1. Log an Expense");
		System.out.println("2. Log a Deposit");
		// takes choice
		int choice = scanI();
		// need for later
		int choice2 = 0;
		String e = "";
		// set up date to look like rest of table
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
		Date date = new Date();
		// make date a string
		String strDate = sdf.format(date);
		// create a file writer that writhes to Logs.txt and will not delete
		// text
		FileWriter write = new FileWriter("logs.txt", true);
		// lets you print_line to the file
		PrintWriter print_line = new PrintWriter(write);
		// reads the .txt file
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		// makes each line a string
		String line = br.readLine();
		// need later
		int balance = 0;
		// breaks each line into 5 parts and does this until it hits an empty
		// line
		while (line != null) {
			java.util.StringTokenizer st = new java.util.StringTokenizer(line);
			String date1 = st.nextToken();
			String type = st.nextToken();
			String event = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			balance = Integer.parseInt(st.nextToken());
			line = br.readLine();
		}
		// write a code to take the user choice
		// if expense
		if (choice == 1) {
			// asks for the predetermined events
			System.out.println("What was the event?");
			System.out.println("1. Food");
			System.out.println("2. Entertainment");
			System.out.println("3. Academic");
			System.out.println("4. Other");
			// loop that takes input of events
			do {
				choice2 = scanI();
				if (choice2 == 1) {
					e = "Food_Exp";
					break;
				} else if (choice2 == 2) {
					e = "Entertainment";
					break;
				} else if (choice2 == 3) {
					e = "Academic";
					break;
				} else if (choice2 == 4) {
					e = "Other_Exp";
					break;
				}
			} while (choice2 != 1 || choice2 != 2 || choice2 != 3 || choice2 != 4);
			// ask for and save the amount in y
			System.out.println("What was the amount?");
			int y = scanI();
			// print a new line in correct format using the data the user
			// entered
			print_line.printf("%s" + "%n", strDate + " Expense " + e + " " + y + " " + (balance - y));
			// needed to end the print_line
			print_line.close();
			System.out.println("Log Succesfully Added\n");
			// if deposit
		} else if (choice == 2) {
			// asks for the predetermined events
			System.out.println("What was the event?");
			System.out.println("1. Salary");
			System.out.println("2. Dad_Sent_Some");
			System.out.println("3. Tutoring");
			// loop that takes input of events
			do {
				choice2 = scanI();
				if (choice2 == 1) {
					e = "Salary_Work";
					break;
				} else if (choice2 == 2) {
					e = "Dad_Sent_Some";
					break;
				} else if (choice2 == 3) {
					e = "Tutoring";
					break;
				}
			} while (choice2 != 1 && choice2 != 2 && choice2 != 3);
			// asks for and save the amount in y
			System.out.println("What was the amount?");
			int y = scanI();
			// print a new line in correct format using the data the user
			// entered
			print_line.printf("%s" + "%n", strDate + " Deposit " + e + " " + y + " " + (balance + y));
			// needed to end the print_line
			print_line.close();
			System.out.println("Log Succesfully Added\n");
			// if not 1 or 2 for expense or deposit
		} else
			System.out.println("Invaild entry");
		// Write code for reading an existing file and appending a new line
		// at
		// the end.
	}

	public static void optionB() throws IOException {

		System.out.println("You chose to view all logs for expenses");
		// Write code for Option B here
		// reads the .txt file
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		// breaks each line into a string
		String line = br.readLine();
		// breaks each line into 5 parts until it hits an empty line
		while (line != null) {
			java.util.StringTokenizer st = new java.util.StringTokenizer(line);
			String date = st.nextToken();
			String type = st.nextToken();
			String event = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			int balance = Integer.parseInt(st.nextToken());
			// after this point i will not continue to explain these functions
			// only prints lines that contain expense
			if (type.contains("Expense"))
				System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
			// reads next line
			line = br.readLine();
		}
	}

	public static void optionC() throws IOException {

		System.out.println("You chose to view all logs for deposits");
		// Write code for Option C here
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		while (line != null) {
			java.util.StringTokenizer st = new java.util.StringTokenizer(line);
			String date = st.nextToken();
			String type = st.nextToken();
			String event = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			int balance = Integer.parseInt(st.nextToken());
			// only prints lines that contain deposit
			if (type.contains("Deposit"))
				System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
			line = br.readLine();
		}
	}

	public static void optionD() throws IOException {

		System.out.println(
				"You chose to view all logs for particular month. Enter the month you would like to see (1-12)");
		// Write code for Option D here
		// scans for the choice
		int x = scanI();
		// runs month(int x) method
		month(x);
	}

	public static void optionE() throws IOException {
		System.out.println("You chose to view customized logs for a particular month. Enter the month (1-12): ");
		// Write code for Option E here
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		int x = scanI();
		menuForC();
		int z = scanI();
		if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 10 || x == 11
				|| x == 12) {
			if (z == 1) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					// prints lines only with month x and expense
					if (date.startsWith(x + "/") && type.contains("Expense"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			} else if (z == 2) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					// prints lines only with month x and deposit
					if (date.startsWith(x + "/") && type.contains("Deposit"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			} else if (z == 3) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					// prints lines only with month x
					if (date.startsWith(x + "/"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			}
			// if not 1-3
		} else
			System.out.println("invaild entry");
	}

	public static void optionF() throws IOException {
		System.out.println(
				"You chose to view all logs for particular month. Enter the month you would like to see (1-12)");
		// Take the user input for month
		int x = scanI();
		System.out
				.println("You chose to view all logs for particular month. Enter the day you would like to see (1-31)");
		// Take the user input for day
		int y = scanI();
		// runs day method
		day(x, y);
	}

	public static void optionG() throws IOException {
		System.out.println("You chose to view customized logs for a particular month. Enter the month (1-12): ");
		// Take the user input for month
		int x = scanI();
		System.out.println("Enter the Day (1-31): ");
		// Take the user input for day
		int y = scanI();
		menuForC();
		int z = scanI();
		// Write code for Option F here
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		// makes day or y only 1-31
		if (y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6 || y == 7 || y == 8 || y == 9 || y == 10 || y == 11
				|| y == 12 || y == 13 || y == 14 || y == 15 || y == 16 || y == 17 || y == 18 || y == 19 || y == 20
				|| y == 21 || y == 22 || y == 23 || y == 24 || y == 25 || y == 26 || y == 27 || y == 28 || y == 29
				|| y == 30 || y == 31) {
			if (z == 1) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					// prints only lines with month and day x/y/ and expense
					if (date.startsWith(x + "/" + y + "/") && type.contains("Expense"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			}
			// prints only lines with month and day x/y/ and deposit
			else if (z == 2) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					if (date.startsWith(x + "/" + y + "/") && type.contains("Deposit"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			}
			// prints lines wiht month and day x/y/
			else if (z == 3) {
				while (line != null) {
					StringTokenizer st = new StringTokenizer(line);
					String date = st.nextToken();
					String type = st.nextToken();
					String event = st.nextToken();
					int amount = Integer.parseInt(st.nextToken());
					int balance = Integer.parseInt(st.nextToken());
					if (date.startsWith(x + "/" + y + "/"))
						System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
					line = br.readLine();
				}
			}
			// if not 1-3
		} else
			System.out.println("invaild entry");
	}

	public static void optionH() throws IOException {
		// menu for option H
		System.out.println(
				"You chose to view all logs for a particular Expense. Please select one of the following option");
		System.out.println("1. Food");
		System.out.println("2. Entertainment");
		System.out.println("3. Academic");
		System.out.println("4. Other");
		// Take the user choice
		int x = scanI();
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		if (x == 1) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first four letters of event are
				// "Food"
				if (event.startsWith("Food"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
		} else if (x == 2) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first four letters of event are
				// "Enter"
				if (event.startsWith("Enter"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
		} else if (x == 3) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first four letters of event are
				// "Acad"
				if (event.startsWith("Acad"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
		} else if (x == 4) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first four letters of event are
				// "Other"
				if (event.startsWith("Other"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
			// if not 1-4
		} else
			System.out.println("invaild option");
		// Write the code for Option H
	}

	public static void optionI() throws IOException {
		// menu for choices of optionI
		System.out.println(
				"You chose to view all logs for a particular Deposit. Please select one of the following option");
		System.out.println("1. Salary");
		System.out.println("2. Dad_Sent_Some");
		System.out.println("3. Tutoring");
		// Take the user choice
		int x = scanI();
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		if (x == 1) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first four letters of event are
				// "Sala"
				if (event.startsWith("Sala"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
		} else if (x == 2) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines where the first three letters of event are
				// "Dad"
				if (event.startsWith("Dad"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
		} else if (x == 3) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only print lines where the first three letters of event are
				// "tut"
				if (event.startsWith("tut"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
			// if not 1-3
		} else
			System.out.println("invaild option");
		// Write the code for Option I

	}

	/**
	 * This Is the only method given to you. Use this method to understand. You
	 * can copy paste code from this method to any other methods. However, if
	 * you do copy, make sure that you have necessary tweaks / addition /
	 * changes to the code based on what the option wants.
	 *
	 * Hint : All the methods in some way is going to use this code given in
	 * OptionJ method. By using proper conditional statements and user input and
	 * proper calculations, correct results for display can be obtained.
	 *
	 * @throws IOException
	 */
	public static void optionJ() throws IOException {

		// A BufferedReader object is used to read an existing file in the
		// project.
		// Make sure that the log.txt file is in the Java Project Folder.
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));

		// br.readLine() reads the first line from the BufferedReader, assigns
		// it to String line and then deletes it.
		// This way, we can reach the 2nd line or the nth line by writing
		// br.readLine(); two times or n times.
		String line = br.readLine();

		// to write a code that reach end of file (n lines)
		// we say that while line has some string in it. Once at an end,
		// br.readLine returns null if all lines are finished.
		while (line != null) {

			// String Tokenizer is something that is used to seperate words in a
			// line based on a delimeter
			// Default delimeter is space and our log.txt file is space
			// delimetered file for each line.
			StringTokenizer st = new StringTokenizer(line);

			// Since we know that each line has 5 elements to it, we can use
			// that information and assign those 5 strings (Tokens)
			// And now we have individual Access to data, ie. we can now see the
			// particular line and see the date, type, event, etc and use it for
			// comparison.
			String date = st.nextToken();
			String type = st.nextToken();
			String event = st.nextToken();
			int amount = Integer.parseInt(st.nextToken());
			int balance = Integer.parseInt(st.nextToken());

			// This line will be simply printing out the give string. we use \t
			// to make it in a better Format.
			System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);

			// In order to not repeat the process for the same line, we use
			// br.readLine at the end of loop to make sure that it has a next
			// line
			// and to assign that new line to the variable line and repeat the
			// same process until its value reaches to null.
			line = br.readLine();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to your daily expense table OUO");

		// Add a suitable looping for this menu. It can be While / Do-while /
		// for loops.
		// The menu should loop everytime after the option execution is over
		// until the user selects Q
		char choice;
		// loops until user enters 'Q'
		do {
			// calls method menu();
			choice = menu();
			// takes the return of menu() and creates a switch menu for each
			// option
			// and a response if invalid entry
			switch (choice) {

			case 'A':
				optionA();
				break;
			case 'B':
				optionB();
				break;
			case 'C':
				optionC();
				break;
			case 'D':
				optionD();
				break;
			case 'E':
				optionE();
				break;
			case 'F':
				optionF();
				break;
			case 'G':
				optionG();
				break;
			case 'H':
				optionH();
				break;
			case 'I':
				optionI();
				break;
			case 'J':
				optionJ();
				break;
			case 'Q':
				System.out.println("GoodBye :)");

				break;
			default:
				System.out.println("Invalid Option :(");
			}
		} while (choice != 'Q');
	}

	public static void menuForC() throws IOException {
		// used this enough to turn it into a method
		System.out.println("1. Expenses");
		System.out.println("2. Deposits");
		System.out.println("3. Both");
	}

	public static void day(int x, int y) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		// only lets y be 1-31
		if (y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6 || y == 7 || y == 8 || y == 9 || y == 10 || y == 11
				|| y == 12 || y == 13 || y == 14 || y == 15 || y == 16 || y == 17 || y == 18 || y == 19 || y == 20
				|| y == 21 || y == 22 || y == 23 || y == 24 || y == 25 || y == 26 || y == 27 || y == 28 || y == 29
				|| y == 30 || y == 31) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// only prints lines with month and day, x/y
				if (date.startsWith(x + "/" + y + "/"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
			// if not 1-31 for day
		} else
			System.out.println("invaild entry");
	}

	public static void month(int x) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("logs.txt"));
		String line = br.readLine();
		// makes it so x can only be 1-12
		if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 10 || x == 11
				|| x == 12) {
			while (line != null) {
				StringTokenizer st = new StringTokenizer(line);
				String date = st.nextToken();
				String type = st.nextToken();
				String event = st.nextToken();
				int amount = Integer.parseInt(st.nextToken());
				int balance = Integer.parseInt(st.nextToken());
				// takes x and only prints like with the date of the month
				// starting with x
				if (date.startsWith(x + "/"))
					System.out.println(date + " \t" + type + " \t" + event + " \t" + amount + " \t" + balance);
				line = br.readLine();
			}
			// if not 1-12 for month
		} else
			System.out.println("invaild entry");
	}

}
