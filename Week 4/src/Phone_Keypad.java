/**
 * 
 * @author justin minsk
 * @version [2/6/2017]
 * 
 *Take a letter and give the corrispodning number on a phone key pad
 *
 *set up scanner
 *ask for letter
 *set letter to string l
 *convert l to char
 *n=0
 *if and else statements 
 *for l so that you get letter to number 
 *by have n change vaule 
 *display l " is " n " on key pad"
 */
import java.util.Scanner;

public class Phone_Keypad {
public static void main(String[] args){
	//set up scanner
	Scanner scan = new Scanner(System.in);
	//set up n so that even if they do not put a letter
	//in a number still shoots out
	int n = 0;
	//ask for input
	System.out.println("What is your letter?");
	//get the input
	String l = scan.nextLine();
	//conver to char
	char lChar = l.charAt(0);
	//if statements to get all letter combos to their numbers
	if (lChar == 'a'){
		n = 2;
	}
	if (lChar == 'A'){
		n = 2;
	}
	if (lChar == 'b'){
		n = 2;
	}
	if (lChar == 'B'){
		n = 2;
	}
	if (lChar == 'c'){
		n = 2;
	}
	if (lChar == 'C'){
		n = 2;
	}
	if (lChar == 'd'){
		n = 3;
	}
	if (lChar == 'D'){
		n = 3;
	}
	if (lChar == 'e'){
		n = 3;
	}
	if (lChar == 'E'){
		n = 3;
	}
	if (lChar == 'f'){
		n = 3;
	}
	if (lChar == 'F'){
		n = 3;
	}
	if (lChar == 'g'){
		n = 4;
	}
	if (lChar == 'G'){
		n = 4;
	}
	if (lChar == 'h'){
		n = 4;
	}
	if (lChar == 'H'){
		n = 4;
	}
	if (lChar == 'i'){
		n = 4;
	}
	if (lChar == 'I'){
		n = 4;
	}
	if (lChar == 'j'){
		n = 5;
	}
	if (lChar == 'J'){
		n = 5;
	}
	if (lChar == 'k'){
		n = 5;
	}
	if (lChar == 'K'){
		n = 5;
	}
	if (lChar == 'l'){
		n = 5;
	}
	if (lChar == 'L'){
		n = 5;
	}
	if (lChar == 'm'){
		n = 6;
	}
	if (lChar == 'M'){
		n = 6;
	}
	if (lChar == 'n'){
		n = 6;
	}
	if (lChar == 'N'){
		n = 6;
	}
	if (lChar == 'o'){
		n = 6;
	}
	if (lChar == 'O'){
		n = 6;
	}
	if (lChar == 'p'){
		n = 7;
	}
	if (lChar == 'P'){
		n = 7;
	}
	if (lChar == 'q'){
		n = 7;
	}
	if (lChar == 'Q'){
		n = 7;
	}
	if (lChar == 'r'){
		n = 7;
	}
	if (lChar == 'R'){
		n = 7;
	}
	if (lChar == 's'){
		n = 7;
	}
	if (lChar == 'S'){
		n = 7;
	}
	if (lChar == 't'){
		n = 8;
	}
	if (lChar == 'T'){
		n = 8;
	}
	if (lChar == 'u'){
		n = 8;
	}
	if (lChar == 'U'){
		n = 8;
	}
	if (lChar == 'v'){
		n = 8;
	}
	if (lChar == 'V'){
		n = 8;
	}
	if (lChar == 'w'){
		n = 9;
	}
	if (lChar == 'W'){
		n = 9;
	}
	if (lChar == 'x'){
		n = 9;
	}
	if (lChar == 'X'){
		n = 9;
	}
	if (lChar == 'y'){
		n = 9;
	}
	if (lChar == 'Y'){
		n = 9;
	}
	if (lChar == 'z'){
		n = 9;
	}
	if (lChar == 'Z'){
		n = 9;
	}
	//state the outputs
	System.out.println(l+" is "+n+" on a phone key pad.");
}
}