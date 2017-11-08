/**
 * 
 * @author Justin Minsk
 * @version [2/1/2017]
 * picks a random card from a standard 52 card deck
 * 
 * START
 * set up scanner
 * display "would you pick a card? Y/N"
 * boolean choice user input
 * Y == true
 * int faceVAule = generate a random number 1-13 
 * (int randNum = (int)(Math.random()*(MAX-MIN))+MIN)
 * if faceVaule 1 = ace
 * else if >1<11 = display faceValue
 * else if 11 = jack
 * else if 12 = queen
 * else if 13 = king
 * int suit generate random number 0-3
 * if suit 0 = of hearts
 * else if  1 = of diamonds
 * else if  2 = of clubs
 * else if 3 = of spades
 *
 * N == false
 * END
 *
 */
import java.util.Scanner;

public class pickACard {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Would you like to pick a card? Y/N");
	String choice = scan.nextLine();
	char choice2 = choice.charAt(0);
	if (choice2 == 'Y'){
		int faceVaule = (int)(Math.random()*(13-1)+1);
		if (faceVaule == 1){
			System.out.print("Ace ");
		}
		else if (faceVaule>1 || faceVaule<11){
			System.out.print(faceVaule+" ");
		}
		else if (faceVaule == 11){
			System.out.print("Jack ");
		}
		else if (faceVaule == 12){
			System.out.print("Queen ");
		}
		else if (faceVaule == 13){
			System.out.print("King ");
		}
		int suit=(int)(Math.random()*(3-0)+0);
		if (suit == 0){
			System.out.print(" of Hearts");
		}
		else if (suit == 1){
			System.out.print(" of Diamonds");
		}
		if (suit == 2){
			System.out.print(" of Clubs");
		}
		if (suit == 3){
			System.out.print(" of Spades");
		}
	}
	else{
		System.out.print(",");
	}
}
}
