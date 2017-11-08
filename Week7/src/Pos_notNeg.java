/**
 * @author Justin Minsk
 * @version [2/20/2017]
 * 
 * have user entered numbers that checks if they are postive or negtive 
 * if postive it adds to a total
 * first negtive ends the process
 * 
 * create scanner
 * display instructions for them to enter one at a time postive numbers first
 * double x is user input
 * int n is 0
 * while x is less than 0
 * loop add 1 to n
 * break 
 * number of postive numbers is n
 */
import java.util.Scanner;

public class Pos_notNeg {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number at a time from your list.");
	System.out.println("Enter one at a time from postive numbers to negtive.");
	double x = scan.nextDouble();
	int n = 0;
	while (x > 0){
		++n;
		x = scan.nextDouble();
	}
	System.out.println("There are "+n+" postive numbers.");
}
}
