/**
 * @author Justin Minsk
 * @version [2/1/2017]
 * Guessing Game
 * a simple game that lets the player pick number 1-10
 * and see if it matches the computer 
 * who has a random number generator 
 * with whole number integers 1-10
 * Then tells the player if they got the right answer or not.
 */
import java.util.Scanner;

public class GuessingGame {
public static void main(String[] args){
	Scanner scan2 = new Scanner(System.in);
	//Creating the computers number 1-10
	int CPUNumber = (int)(Math.random()*(10-1)+1);
	System.out.println("Welcome to the guessing game!");
	System.out.println(" ");
	System.out.println("Guess a number 1-10!");
	System.out.println(" ");
	//players input 1-10
	int guess = scan2.nextInt();
	//if statements that state if the player guessed the number correctly
	if (CPUNumber == guess){
		System.out.println(" ");
		System.out.println("You guessed the number "+CPUNumber+" !!!!");
	}
	else{
		System.out.println(" ");
		System.out.println("You guessed wrong, the number was "+CPUNumber);
	}
}
}
