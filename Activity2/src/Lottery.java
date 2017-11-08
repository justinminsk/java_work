/**
 * Justin David Minsk
 * 1/25/2017
 * 
 * Description
 * User enters a two digit number and the program randomly sees if 
 * the number wins any money amount.
 * 
 * Pseudocode
 * set lottery to randomly spit out 0-99
 * ask for two digit number
 * user input guess to get the two digit number
 * set lotteryDigit1 becomes lottery/10 
 * which gives what the first (tens place) digit is in lottery
 * set lotteryDigit2 to become lottery%10 
 * which gives the second (ones place) digit is in lottery
 * set guessDigit1 to become guess/10
 * ""as line 14 but with your guess instead
 * set guessDigit2 to become guess%10 
 * ""as line 16 but with your guess instead
 * if guess and lottery are equal then you win 10k
 * else if either the ones place digit or tens place digit is the same
 * win 3k
 * else if any of the digits (ones or tens ie 15 and 50 the 5s match)
 * win 1k
 * else sorry no match
 * 
 */
import java.util.Scanner;

public class Lottery {
	 public static void main(String[] args) {
		 int lottery = (int)(Math.random() * 100);
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter your lottery pick (two digits): ");
		 int guess = input.nextInt();
		 int lotteryDigit1 = lottery / 10;
		 int lotteryDigit2 = lottery % 10;
		 int guessDigit1 = guess / 10; 
		 int guessDigit2 = guess % 10;
		 if (guess == lottery) 
		 	System.out.println("Exact match: you win $10,000"); 
		 else if (guessDigit2 == lotteryDigit1 
		 && guessDigit1 == lotteryDigit2)
		 	System.out.println("Match all digits: you win $3,000"); 
		 else if (guessDigit1 == lotteryDigit1 
		 || guessDigit1 == lotteryDigit2
		 || guessDigit2 == lotteryDigit1 
		 || guessDigit2 == lotteryDigit2)
		 	System.out.println("Match one digit: you win $1,000");
		 else
		 	System.out.println("Sorry, no match");
	 }
}