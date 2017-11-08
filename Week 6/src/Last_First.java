import java.util.Scanner;

public class Last_First {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your first name?");
	String first = scan.nextLine();
	System.out.println("What is your last name?");
	String last = scan.nextLine();
	System.out.println(last+", "+first);
}
}
