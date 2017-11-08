/**
 * 
 * @author Justin Minsk
 * @version [2/20/2017]
 * 
 * a menu with four choices including exit and a message if a wrong input is entered
 *
 *set scanner
 *display menu
 *user inputed response x
 *if x > 4 or x < 1
 *do
 *display Wrong Choice! Try Again! 
 *user inputed x
 *while  x > 4 or x < 1
 *if 1 was entered
 *display menu 1
 *if 2 was entered
 *display menu 2
 *if 3 was entered
 *display menu 3
 *if 4 was entered
 *display Thank you come again
 */
import java.util.Scanner;

public class menu {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number corresponding to the menu choice.");
	System.out.println("1. Menu 1");
	System.out.println("2. Menu 2");
	System.out.println("3. Menu 3");
	System.out.println("4. Menu 4");
	int x = scan.nextInt();
	if (x>4 || x<1){
		do{
			System.out.println("Wrong Choice! Try Again!" );
			x = scan.nextInt();	
		} while (x>4 || x<1);
		}
	if (x == 1){
		System.out.println("Menu 1");
	}
	if (x == 2){
		System.out.println("Menu 2");
	}
	if (x == 3){
		System.out.println("Menu3");
	}
	if (x == 4){
		System.out.println("Thank you come again");
	}
}
}
