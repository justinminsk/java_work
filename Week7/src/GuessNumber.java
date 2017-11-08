/**
 * @author justin Minsk
 *@version [2/22/2017]
 *random number guessing game 0-100
 *
 *create random number between 1-100
 *make that number number
 *set up scanner
 *ask for a guess between 1-100
 *create int i at -1
 *while the guess is not the number
 *let them reguess 
 *if guess equals number tell them the number is right
 *if guess > number guess is too high
 *if guess < number guess is too low
 *
 */
import java.util.Scanner;

public class GuessNumber {
 public static void main(String[] args) {
	 // Generate a random number to be guessed 
	 int number = (int)(Math.random() * 101); 
	 //set up scanner
	  Scanner input = new Scanner(System.in);
	  System.out.println("Guess a magic number between 0 and 100");
	  //int guess at -1 so the loop starts
	  int guess = -1; 
	  while (guess != number) {
		   // Prompt the user to guess the number
System.out.print("\nEnter your guess: ");
	  guess = input.nextInt(); 
	  //different variations of possible outcomes of guess compared to number
	   if (guess == number) 
		  System.out.println("Yes, the number is " + number);
		   else if (guess > number)
			   System.out.println("Your guess is too high");
		   else
			   System.out.println("Your guess is too low");
	    } // End of loop
 }
 }

