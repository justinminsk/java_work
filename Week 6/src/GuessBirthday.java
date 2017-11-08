/**
 * @author Justin Minsk
 * @version [2/15/2017]
 * 
 * guess the birthday with sets of numbers
 * 
 * set up the 5 sets that represent an answer so that you add up to 31 (11111) 
 * so set 1 (00001)
 * set 2 (00010)
 * set 3 (00100)
 * set 4 (01000)
 * set 5 (10000)
 * meaning set one needs +1 to make the number
 * set 2 needs +2
 * set 3 needs +4
 * set 4 needs +8
 * set 5 needs +16
 * for example 8 only needs set 4
 * 31 needs all 5
 * 27 needs 1,2,4, and 5 
 * etc
 * create int day = 0
 * set up scanner
 * ask if their birthday is in set 1
 * display 0 for no 1 for yes
 * create int answer 
 * if yes 
 * day + = 1
 * ask if their birthday is in set 2
 * display 0 for no 1 for yes
 * if yes
 * day += 2
 * ask if their birthday is in set 3
 * display 0 for no 1 for yes
 * if yes
 * day += 4
 * ask if their birthday is in set 4
 * display 0 for no 1 for yes
 * if yes 
 * day += 8
 * ask if their birthday is in set 5
 * display 0 for no 1 for yes
 * if yes
 * day += 16
 * display your birthday is day
 */
import java.util.Scanner;

public class GuessBirthday {
public static void main(String[] args){
	// set up the 5 sets
	String set1 =
			"1  3  5  7\n" +
			"9  11 13 15\n" +
			"17 19 21 23\n" +
			"25 27 29 31";
	String set2 =
			"2  3  6  7\n"+
			"10 11 14 15\n"+
			"18 19 22 23\n"+
			"26 27 30 31";
	String set3 =
			"4  5  6  7\n"+
			"12 13 14 15\n"+
			"20 21 22 23\n"+
			"28 29 30 31";
	String set4 =
			"8  9 10 11\n"+
			"12 13 14 15\n"+
			"25 25 26 27\n"+
			"28 29 30 31";
	String set5 =
			"16 17 18 19\n"+
			"20 21 22 23\n"+
			"24 25 26 27\n"+
			"28 29 30 31";
	//create day varible 
	int day = 0;
	//set up scanner
	Scanner input = new Scanner(System.in);
	//ask if their birthday is in each set
	System.out.print("Is your birthday in set1?\n");
	System.out.print(set1);
	//set up an answer yes or no if it is
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	int answer = input.nextInt();
	//day += 1 if yes
	if (answer == 1)
		day += 1;
	//ask if their birthday is in each set
	System.out.print("Is your birthday in set2?\n");
	System.out.print(set2);
	//set up an answer yes or no if it is
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	answer = input.nextInt();
	//day += 2 if yes
	if (answer == 1)
		day += 2;
	//ask if their birthday is in each set
	System.out.print("Is your birthday in set3?\n");
	System.out.print(set3);
	//set up an answer yes or no if it is
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	answer = input.nextInt();
	//day += 4 if yes
	if (answer == 1)
		day += 4;
	//ask if their birthday is in each set
	System.out.print("Is your birthday in set4?\n");
	System.out.print(set4);
	//set up an answer yes or no if it is
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	answer = input.nextInt();
	//day += 8 if yes
	if (answer == 1)
		day += 8;
	//ask if their birthday is in each set
	System.out.print("Is your birthday in set5?\n");
	System.out.print(set5);
	//set up an answer yes or no if it is
	System.out.print("\nEnter 0 for No and 1 for Yes: ");
	answer = input.nextInt();
	//day += 16 if yes
	if (answer == 1)
		day += 16;
	//display the day
	System.out.println("\nYour birthday is "+day+"!");
}
}
